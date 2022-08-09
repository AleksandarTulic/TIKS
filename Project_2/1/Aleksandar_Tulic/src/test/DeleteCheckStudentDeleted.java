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
import org.openqa.selenium.support.ui.Select;

/*
 * Description: Here we test if the correct student has being deleted.
 * */

public class DeleteCheckStudentDeleted {
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
	@DisplayName("Delete - Check If The Real User Has being deleted")
	public void deleteCheckStudentDeleted() {
		driver.get("http://localhost:4200/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.findElement(By.linkText("Add Student")).click();
		driver.findElement(By.cssSelector(".row:nth-child(2) > .col-sm-4:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Jovica");
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("jovica@gmail.com");
		driver.findElement(By.cssSelector(".ng-untouched")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
		}
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Jelena");
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("jelena@outlook.com");
		driver.findElement(By.cssSelector(".ng-untouched")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
		}
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Darija");
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("darija@outlook.com");
		//System.out.println(1);

		driver.findElement(By.cssSelector(".ng-untouched")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
		}
		//System.out.println(2);
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.linkText("View Student")).click();
		
		{
			Select typeView = new Select(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[2]/td[4]/button[1]")).click();
		
		driver.findElement(By.linkText("View Student")).click();
		
		{
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
		
		String name1 = driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
		String name2 = driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr[2]/td[1]")).getText();
		assertThat(name1, is("Jovicaa"));
		assertThat(name2, is("Darijaa"));
	}
}
