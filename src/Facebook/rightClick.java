package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) {

   System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.navigate().to("https://testautomationpractice.blogspot.com/");
   driver.manage().window().maximize();
   
   WebElement clickme = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
   
   Actions act = new Actions(driver);
   act.moveToElement(clickme).contextClick().build().perform();
   
   

	}

}
