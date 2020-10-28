package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_iFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.<')]"));
        driver.switchTo().frame(outerframe);
        Thread.sleep(3000);
        WebElement inside = driver.findElement(By.xpath("//iframe[contains(text(),'<p>Your browser does not support iframes.<')]"));
        driver.switchTo().frame(inside);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("rajibalom");
        
        
        
	}

}
