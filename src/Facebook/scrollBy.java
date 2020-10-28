package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest\\new\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("scrollBy(0,20000);");
		
		WebElement ele = driver.findElement(By.linkText("WindowRectParameters"));
		js.executeScript("arguments[0].scrollIntoView();", ele);

		
	}

}
