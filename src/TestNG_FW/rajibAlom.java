package TestNG_FW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class rajibAlom {
	static WebDriver driver;
	 @BeforeMethod
	  public void launchingApplication() {
		 System.out.println("Open the application");
	  }
	
	 @Test(enabled=false)
	  public void windo() {
			Actions act =new Actions(driver);
			act.keyDown(Keys.SHIFT).click().build().perform();
		}
	
	 
	 
	@Test(invocationCount=5)
  public void loginFB() throws InterruptedException {
		System.out.println(" Code1");
		System.out.println(" Code2");
		Thread.sleep(5000);
	}
	
	@Test
	  public void loginGmail() {
			System.out.println(" Gmail1");
			System.out.println(" Gmail2");
		}
	
	 public void loginGmail2() {
			System.out.println(" Gmail1");
			System.out.println(" Gmail2");
		}
	
	@Test(enabled=false)
	  public void login() {
			System.out.println(" TC1");
			System.out.println(" TC2");
		}

  @AfterMethod
  public void closingApplication() {
	  System.out.println(" Closing the application");
  }

}
