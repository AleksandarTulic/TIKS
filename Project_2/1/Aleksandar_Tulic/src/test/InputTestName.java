package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Description: Here we test if the Name of the students is the same as those in input
 * 
 * */

public class InputTestName {
	WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		
		init.InputValues.input(driver);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	@DisplayName("Input - Test Name")
	public void inputTestName() {
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
	    }
	    
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > .sorting_1")).getText(), is("DarKO"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(2) > .sorting_1")).getText(), is("JeLEna"));
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(3) > .sorting_1")).getText(), is("JeleNa"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(4) > .sorting_1")).getText(), is("JeleNa"));
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(5) > .sorting_1")).getText(), is("JeleNa"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(6) > .sorting_1")).getText(), is("Lee"));
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(7) > .sorting_1")).getText(), is("Lee"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(8) > .sorting_1")).getText(), is("Lee"));
	}
}
