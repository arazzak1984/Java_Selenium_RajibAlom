package Facebook;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Page_Using_Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link = "+alllinks.size());
		
		for(WebElement e:alllinks) {
			System.out.println(e.getText());
		}
		
	
		
		
		
		
	
	}

}
