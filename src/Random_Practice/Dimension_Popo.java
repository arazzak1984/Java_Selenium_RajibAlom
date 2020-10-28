package Random_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension_Popo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://money.rediff.com/gainers/bs/daily/groupa?");
		
		Dimension d = new Dimension(600,500);
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
