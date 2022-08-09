package init;

import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputValues {
	public static void input(WebDriver driver) {
		driver.get("http://localhost:4200/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
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
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("JeLEna");
		driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("jelena@outLOOK.Com");
		driver.findElement(By.cssSelector(".ng-untouched")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
		}
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("JeleNa");
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("JeLEna@outlook.coM");
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".ng-valid")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
		}
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("JeleNa");
		driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("JeLEna@outlook.coM");
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("JeLEna@outlook.coM");
		driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
		}
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("JeleNa");
		driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
		}
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Lee");
		driver.findElement(By.cssSelector(".form-group:nth-child(2)")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("Yu");
		driver.findElement(By.cssSelector(".ng-invalid:nth-child(1)")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
		}
		
		
		driver.findElement(By.cssSelector(".form-group:nth-child(1) span")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .alert")).click();
		{
		  List<WebElement> elements = driver.findElements(By.cssSelector(".form-group:nth-child(1) span"));
		  assert(elements.size() > 0);
		}
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .alert")).click();
		{
		  List<WebElement> elements = driver.findElements(By.cssSelector(".form-group:nth-child(2) span"));
		  assert(elements.size() > 0);
		}

		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/button")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Lee");
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("Yu");
		driver.findElement(By.cssSelector(".ng-invalid:nth-child(1)")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/button")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Lee");
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("lee@gmail.com");
		driver.findElement(By.cssSelector("html")).click();
		
		driver.findElement(By.cssSelector(".ng-untouched")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
		}
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[2]/input")).sendKeys("Yu");
		driver.findElement(By.cssSelector(".form-group:nth-child(3)")).click();
		{
		  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
		  dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
		}
		driver.findElement(By.cssSelector(".ng-invalid:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.linkText("View Student")).click();
		
		{
			///html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select
			//driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")).click();
			//driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select/option[4]")).click();
			Select typeView = new Select(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
	}
}
