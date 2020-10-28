package Facebook;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	private static final String String = null;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

		String curentwindo = driver.getWindowHandle();
		System.out.println(curentwindo);
		
		String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Forgot Password?")).sendKeys(tab);
		
		ArrayList<String> tabid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabid.get(1));
		
		/*WebElement openwindo=driver.findElement(By.linkText("Forgot account?"));
		act.keyDown(Keys.SHIFT).click(openwindo).build().perform();
        driver.switchTo().window(curentwindo);*/
		
	}

}
