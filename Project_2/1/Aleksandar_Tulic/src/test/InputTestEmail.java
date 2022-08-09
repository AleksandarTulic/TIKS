package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
 * Description: Here we test if the Email of the students is the same as those in input
 * 
 * */

public class InputTestEmail {
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
	@DisplayName("Input - Test Email")
	public void inputTestEmail() {
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    
	    {
			Select typeView = new Select(driver.findElement(By.xpath("html/body/app-root/div/app-student-list/div[1]/div[2]/div/div[1]/label/select")));
			typeView.selectByIndex(3);
		}
	    
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(2)")).getText(), is("daRKo@gmail.COM"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(2)")).getText(), is("jelena@outLOOK.Com"));
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".even:nth-child(3) > td:nth-child(2)"));
	      assert(elements.size() == 0);
	    }
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(2)")).getText(), is("JeLEna@outlook.coM"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(6) > td:nth-child(2)")).getText(), is("Yu"));
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".even:nth-child(5) > td:nth-child(2)"));
	      assert(elements.size() == 0);
	    }
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(6) > td:nth-child(2)")).getText(), is("Yu"));
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(7) > td:nth-child(2)")).getText(), is("Yu"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(8) > td:nth-child(2)")).getText(), is("lee@gmail.com"));
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(9) > td:nth-child(2)")).getText(), is("JeLEna@outlook.coM"));
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".odd:nth-child(10) > td:nth-child(2)"));
	      assert(elements.size() == 0);
	    }
	    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(11) > td:nth-child(2)")).getText(), is("JeLEna@outlook.coM"));
	    assertThat(driver.findElement(By.cssSelector(".even:nth-child(12) > td:nth-child(2)")).getText(), is("Yu"));
	}
}
