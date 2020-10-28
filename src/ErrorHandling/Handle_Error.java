package ErrorHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Error {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("atlantic city");
	
		try {
			driver.findElement(By.id("passfjjjjk")).sendKeys("156r");
		} 
		
		catch (Exception e) {
			System.out.println("Exeption Handle");
		}
		
		driver.findElement(By.name("login")).click();
	}

}
