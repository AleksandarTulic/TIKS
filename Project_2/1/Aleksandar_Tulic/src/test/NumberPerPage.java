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
 * Description: Here we test if the text below the table in View Student
 * is "What it should be" after choosing different options of VIEW
 * 
 * */

public class NumberPerPage {
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
	@DisplayName("Input - Test Number Of Elements")
	public void numberPerPage() {
	    driver.manage().window().setSize(new Dimension(1920, 1040));
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
	    
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")).click();
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(0);
		}
	    
	    driver.findElement(By.linkText("1")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).click();
	    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(), is("Showing 1 to 6 of 12 entries"));
	    driver.findElement(By.linkText("2")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).click();
	    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(), is("Showing 7 to 12 of 12 entries"));
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")).click();
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(1);
		}
	    
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).click();
	    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(), is("Showing 1 to 12 of 12 entries"));
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")).click();
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(2);
		}
	    
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).click();
	    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(), is("Showing 1 to 12 of 12 entries"));
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")).click();
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
	    
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).click();
	    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[4]")).getText(), is("Showing 1 to 12 of 12 entries"));
	}
}
