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
 * Description: Here we test if the Branch of the students is the one that was selected
 * previously in update
 * 
 * */

public class UpdateTestBranch {
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
	@DisplayName("Update - Test Branch")
	public void updateTestBranch() {
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}

	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[12]/td[3]")).getText()
	    		,
	    		is("M-Tech")
	    		);
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[11]/td[3]")).getText()
	    		,
	    		is("M-Tech")
	    		);
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[10]/td[3]")).getText()
	    		,
	    		is("M-Tech")
	    		);
	    
	    assertThat(
	    		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[9]/td[3]")).getText()
	    		,
	    		is("M-Tech")
	    		);
	}
}
