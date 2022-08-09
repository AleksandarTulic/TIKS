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
 * Description: here we test if the number of students is changed after we deleted one student and enter some value in the search box.
 * That "some value" = is the name of the student we deleted.(we know the name is not the same as what we inputed but 
 * it has the same prefix)
 * So if the element is correctly deleted it should not appear here in the result by that we the 
 * text below the table should be a fixed value that we know.
 * */

public class DeleteCheckIfInList {
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
	@DisplayName("Delete - Check If Student Is In List")
	public void deleteCheckIfInList() {
		driver.manage().window().setSize(new Dimension(1936, 1056));
		
		{
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		driver.findElement(By.cssSelector(".even:nth-child(8) .fa")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[2]/label/input")).sendKeys("Lee");
	
		{
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(),
				is("Showing 1 to 2 of 2 entries (filtered from 11 total entries)"));
	}
}
