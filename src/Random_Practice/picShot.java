package Random_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class picShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("kokokoko");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("./newscreenshotfold/name_1.png"));

	}

}
