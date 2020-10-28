package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute_xpath {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.horizonnjhealth.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='MEMBER SIGN IN']")).click();

	}

	
}
