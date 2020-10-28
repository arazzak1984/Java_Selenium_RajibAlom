package Hello_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class If_Else_For_Para {

	public static void main(String[] args) {
		
		String browser = "Firefox";
		
		if(browser.equals("chrome_browser")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			
			
			System.out.println("Execute my code in chrome browser");
			
		}
		else if(browser.equals("Firefox")){
			System.out.println("Code execute in firefox");
			
		}else if(browser.equals("Internet_Explorer")){
			System.out.println("Code execute in Internet_Explorer");
		}else {
			System.out.println(" Just correct your code");
		}
	}

}
