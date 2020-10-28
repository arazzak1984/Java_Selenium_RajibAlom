package Facebook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_array {
	WebDriver driver;
	
	@BeforeClass
	public void loginbefore() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		  driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		
	}
	 
  @Test(dataProvider="getData")
  public void f(String emain, String pasan) throws InterruptedException {
	  
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emain);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).sendKeys(pasan);
	 
  }
  @DataProvider
  public String[][] getData(){
	  String dat[][] = new String[2][2];  // String replace with Object
	  //First set
	  dat[0][0]="Sumon";
	  dat[0][1]="345";
			  
	 // Second set
		dat[1][0]="khan";
		dat[1][1]="234";
	  
	  
	  return dat;
  }
  
  
  
  
}
