package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		driver.manage().window().maximize();
		
		WebElement frame_one = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		driver.switchTo().frame(frame_one);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame_two = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		driver.switchTo().frame(frame_two);
		driver.findElement(By.linkText("CommandProcessor")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		WebElement frame_three = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		driver.switchTo().frame(frame_three);
		driver.findElement(By.linkText("HttpCommandProcessor")).click();
		

	}

}
