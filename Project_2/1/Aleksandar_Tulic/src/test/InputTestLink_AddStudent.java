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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.not;

/*
 * Description: Here we test if the link Add Student works after adding one student.
 * 
 * */

public class InputTestLink_AddStudent {
	WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	@DisplayName("Input - Test Link AddStudent")
	public void InputTestLinkAddStudent() {
		driver.get("http://localhost:4200/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
	    driver.findElement(By.linkText("Add Student")).click();
	    
	    ///html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input
	    ///html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input
	    driver.findElement(By.linkText("Add Student")).click();
		driver.findElement(By.cssSelector(".row:nth-child(2) > .col-sm-4:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("DarKO");
		driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("daRKo@gmail.COM");
		driver.findElement(By.cssSelector(".ng-untouched")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
		}
	    
	    driver.findElement(By.cssSelector(".btn-success")).click();
	    driver.findElement(By.linkText("Add Student")).click();
	    
	    Dimension siz = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form")).getSize();
	    
	    assertThat(siz.height, is(not(0)));
	}
}
