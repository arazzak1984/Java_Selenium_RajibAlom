package TestNG_FW;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Data_Test {
	static WebDriver driver;
  @Test(dataProvider = "dp")
  public void loginTest(String usernam, String passwordfield) throws InterruptedException {
	  
	  driver.findElement(By.id("email")).clear();
	  
	  driver.findElement(By.id("email")).sendKeys(usernam);
	 
	  Thread.sleep(3000);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(passwordfield);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
	  
	  Thread.sleep(8000);
	  driver.navigate().back();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "dada@yahoo.com", "6789" },
      new Object[] { "rajib@gmail.com", "9876" },
      new Object[] { "alom@gmail.com", "khan" },
      new Object[] { "towhid@gmail.com", "chow" },
      new Object[] { "avhijeet@gmail.com", "dada" },
    
    };
  }
  @BeforeClass
  public void openApplication() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Driver Latest/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void closingApplication() {
	  
  }

}
