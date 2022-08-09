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
 * Description: Here we test if the number of elements in the list is one shorter
 * than it was before we deleted one student(using link: Add Student)
 * 
 * */

public class DeleteCheckIfInTable_AddStudent {
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
	@DisplayName("Delete - Check If In Table after Add Student link")
	public void deleteCheckIfInTable_AddStudent() {
		driver.manage().window().setSize(new Dimension(1936, 1056));
		
		{
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		driver.findElement(By.cssSelector(".even:nth-child(8) .fa")).click();
		driver.findElement(By.linkText("Add Student")).click();
		driver.findElement(By.linkText("View Student")).click();
		{
			///html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}

		int num = driver.findElements(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr")).size();
		//System.out.println(num);
	    
		assertThat(num, is(11));
	}
}
