package Facebook;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimen {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Driver Latest\\\\new\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Dimension dim= new Dimension(800,1600);
		driver.manage().window().setSize(dim);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
