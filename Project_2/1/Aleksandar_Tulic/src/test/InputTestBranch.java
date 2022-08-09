package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Description: Here we test if the Branch of the students is the same as those in input
 * 
 * */

public class InputTestBranch {
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
	@DisplayName("Input - Test Branch")
	public void inputTestBranch() {
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
	    
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).getText(), is("B-Tech"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(3)")).getText(), is("BCA"));
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".odd:nth-child(3) > td:nth-child(3)"));
	      assert(elements.size() == 0);
	    }
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".even:nth-child(4) > td:nth-child(3)"));
	      assert(elements.size() == 0);
	    }
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(5) > td:nth-child(3)")).getText(), is("BCA"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(6) > td:nth-child(3)")).getText(), is("MCA"));
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".odd:nth-child(7) > td:nth-child(3)"));
	      assert(elements.size() == 0);
	    }
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(8) > td:nth-child(3)")).getText(), is("MCA"));
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".odd:nth-child(9) > td:nth-child(3)"));
	      assert(elements.size() == 0);
	    }
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(10) > td:nth-child(3)")).getText(), is("BCA"));
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(11) > td:nth-child(3)")).getText(), is("BCA"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(12) > td:nth-child(3)")).getText(), is("MCA"));
	}
}
