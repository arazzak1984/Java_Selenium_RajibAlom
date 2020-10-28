package Facebook;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingThirdWin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String initialwin = driver.getWindowHandle();
		System.out.println(initialwin);
		
		Actions act = new Actions(driver);
		WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		
		for(int i = 0; i<=4; i++) {
			act.keyDown(Keys.SHIFT).click(forgot).build().perform();
		}
		
		
		/*
		Set<String> setwin = driver.getWindowHandles();  // session id will be handled by  setwin
		
		Iterator<String> itr = setwin.iterator();
		
		while(itr.hasNext()) {
			String secondwin = itr.next();
			if(!initialwin.equals(secondwin)) {
				driver.switchTo().window(secondwin);
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
		
				break;
			}
			
		}
		
		while(itr.hasNext()) {
			String thirdwin = itr.next();
			if(!initialwin.equals(thirdwin)) {
				driver.switchTo().window(thirdwin);
				driver.get("https://www.hotmail.com/");
				driver.manage().window().maximize();
		
			}
		}
		
		driver.switchTo().window(initialwin);*/
	}

}
