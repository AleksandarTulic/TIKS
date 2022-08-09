package test;

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
 * Description: Here We test if the delete "window/form/pop up" will always
 * appear when we delete a student
 */

public class DeleteCheckAlert {
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
	@DisplayName("Delete - Check Alert")
	public void deleteCheckAlert() {
		driver.manage().window().setSize(new Dimension(1936, 1056));
		
		{
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		//System.out.println(1);
		driver.findElement(By.cssSelector(".even:nth-child(12) .btn-primary")).click();
		{
		      List<WebElement> elements = driver.findElements(By.cssSelector(".alert"));
		      assert(elements.size() > 0);
		}
		driver.findElement(By.cssSelector(".close")).click();
		
		//System.out.println(2);
		driver.findElement(By.cssSelector("tr:nth-child(11) .fa")).click();
		{
		      List<WebElement> elements = driver.findElements(By.cssSelector(".alert"));
		      assert(elements.size() > 0);
		      //at test.DeleteCheckAlert.deleteCheckNumber(DeleteCheckAlert.java:43) ------> because it won't appear every time we delete a student
		      //only the first time id appears
		}
		driver.findElement(By.cssSelector(".close")).click();
		//System.out.println(3);
		
		driver.findElement(By.cssSelector("tr:nth-child(10) .btn-primary")).click();
	    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".alert"));
		      assert(elements.size() > 0);
		}
	    driver.findElement(By.cssSelector(".close")).click();
	    
	    driver.findElement(By.cssSelector("tr:nth-child(9) .fa")).click();
	    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".alert"));
		      assert(elements.size() > 0);
		}
	    driver.findElement(By.cssSelector(".close")).click();
	}
}
