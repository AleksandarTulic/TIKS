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
 * 
 * Description: Here we test if the text below the table will change when we delete students.
 * */

public class DeleteCheckNumber {
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
	@DisplayName("Delete - Check Number Of Deleted")
	public void deleteCheckNumber() {
		driver.manage().window().setSize(new Dimension(1936, 1056));
		
		{
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[12]/td[4]/button[1]")).click();
		driver.findElement(By.cssSelector(".close")).click();
		//System.out.println(1);
		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[11]/td[4]/button[1]")).click();
		driver.findElement(By.linkText("View Student")).click();
		//System.out.println(2);
		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[10]/td[4]/button[1]")).click();
		driver.findElement(By.linkText("View Student")).click();
		//System.out.println(3);
		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[9]/td[4]/button[1]")).click();
		driver.findElement(By.linkText("View Student")).click();
		//System.out.println(4);
		driver.findElement(By.linkText("View Student")).click();

		
		//this view student click i had to use because of stale exception
	    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(), 
	    		is("Showing 1 to 8 of 8 entries"));
	}
}
