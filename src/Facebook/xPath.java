package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.horizonnjhealth.com/");
		driver.manage().window().maximize();

	}

}
