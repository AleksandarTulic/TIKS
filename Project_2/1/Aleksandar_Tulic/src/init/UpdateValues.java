package init;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateValues {
	public static void update(WebDriver driver) {
		driver.get("http://localhost:4200/");
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    {
			  WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select"));
			  dropdown.findElement(By.xpath("//option[. = 'All']")).click();
		}
	    driver.findElement(By.cssSelector("input")).sendKeys("");
	    driver.findElement(By.cssSelector("#DataTables_Table_0_filter > label")).click();
	    driver.findElement(By.cssSelector(".even:nth-child(12) .btn-info")).click();
	    driver.findElement(By.cssSelector(".modal-body")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys("AnaBela");
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).sendKeys("anaBELa@gmail.com");
	    driver.findElement(By.cssSelector(".ng-untouched:nth-child(2)")).click();
	    {
	      WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[3]/select"));
	      dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
	    }

	    driver.findElement(By.cssSelector(".btn-success")).click();
	    driver.findElement(By.cssSelector(".btn-danger")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(11) .btn-info")).click();
	    driver.findElement(By.cssSelector(".modal-body")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys(" ");
	    //driver.findElement(By.cssSelector(".modal-content")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).sendKeys("anaBELa@gmail.com");
	    driver.findElement(By.cssSelector(".form-group:nth-child(4) > .form-control")).click();
	    {
	      WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[3]/select"));
	      dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
	    }

	    driver.findElement(By.cssSelector(".btn-success")).click();
	    driver.findElement(By.cssSelector(".btn-danger")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(10) .btn-info")).click();
	    driver.findElement(By.cssSelector(".modal-body")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys("AnaBela");
	    driver.findElement(By.cssSelector(".modal-content")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).sendKeys(" ");
	    driver.findElement(By.cssSelector(".form-group:nth-child(4) > .form-control")).click();
	    {
	      WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[3]/select"));
	      dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
	    }

	    driver.findElement(By.cssSelector(".btn-success")).click();
	    driver.findElement(By.cssSelector(".btn-danger")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(9) .btn-info")).click();
	    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys(" ");
	    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).clear();
	    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[2]/input")).sendKeys(" ");
	    driver.findElement(By.cssSelector(".form-group:nth-child(4) > .form-control")).click();

	    {
	      WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[3]/select"));
	      dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
	    }
	    driver.findElement(By.cssSelector(".btn-success")).click();
	    driver.findElement(By.cssSelector(".btn-danger")).click();
	}
}
