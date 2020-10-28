package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\System Software\\All The Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		 String tabopen = Keys.chord(Keys.CONTROL, Keys.ENTER);
		 driver.findElement(By.linkText("Forgot account?")).sendKeys(tabopen);
		 Thread.sleep(5000);
		 //driver.close();
		
		driver.quit();

	}

}
