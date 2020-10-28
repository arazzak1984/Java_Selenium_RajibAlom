package Facebook;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginModule {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		String windo = driver.getWindowHandle();
		System.out.println(windo);
		
		
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		String expected_title = "Facebook - Log In or Sign Up";
		/*
		if(act_title.equals(expected_title)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		ArrayList <String> tabs = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.name("websubmit")).click();*/
		
		
		
		
   driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("rajib@gmail.com");
		Thread.sleep(5000);
   driver.findElement(By.id("pass")).sendKeys("567");
		
   driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
