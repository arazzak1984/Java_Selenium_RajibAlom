package TestNG_FW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CreateAcct {
 public static WebDriver driver;
  @BeforeMethod
  public void LaunchFB() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
  }
  
  @Test
  public void createAccountMethod() {
	  driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
	  
  }

  @AfterMethod
  public void tearDown() {
  }

}
