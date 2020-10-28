package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendingcapitalValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement emailfield = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.moveToElement(emailfield).keyDown(Keys.SHIFT).sendKeys("rajibalom").build().perform();

	}

}
