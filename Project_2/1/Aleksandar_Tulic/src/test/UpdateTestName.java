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
 * Description: Here we test if the Name of the students is the one that was inputed
 * previously in update
 * 
 * */

public class UpdateTestName {
	WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		
		init.InputValues.input(driver);
		init.UpdateValues.update(driver);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	@DisplayName("Update - Test Name")
	public void updateTestName() {
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[12]/td[1]")).getText()
	    		,
	    		is("AnaBela")
	    		);
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[11]/td[1]")).getText()
	    		,
	    		is(" ")
	    		);
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[10]/td[1]")).getText()
	    		,
	    		is("AnaBela")
	    		);
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[9]/td[1]")).getText()
	    		,
	    		is(" ")
	    		);
	}
}
