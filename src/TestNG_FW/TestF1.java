package TestNG_FW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestF1 {
	static WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("Open Application");
	  }
	
	
	@Test(groups= {"rajib"})
  public void login() throws InterruptedException {
		System.out.println("firstname field");
		System.out.println("lastname field");
		System.out.println("login field");
  }
	

	@Test(enabled=false)
	  public void logingmail3() throws InterruptedException {
			System.out.println("This is code_2");
	  }
	
	@Test(invocationCount=10)
	  public void signhotmail1() throws InterruptedException {
			System.out.println("This is code_3");
	  }
	
	@Test(timeOut =5000)
	  public void login2() throws InterruptedException {
			System.out.println("firstname field");
			System.out.println("lastname field");
			System.out.println("login field");
	  }
		

		@Test()
		  public void logingmail() throws InterruptedException {
				System.out.println("This is code_2");
		  }
		
		@Test(invocationCount=10)
		  public void signhotmail() throws InterruptedException {
				System.out.println("This is code_3");
		  }
	 
	 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close Application");
  }

}
