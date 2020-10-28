package Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dup_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> duplicate = driver.findElements(By.name("sex"));
		System.out.println("Total duplicate element for rajib :"+duplicate.size());
		
		for(int i=0; i<=duplicate.size(); i++){
			duplicate.get(0).click();
		}

	}

}
