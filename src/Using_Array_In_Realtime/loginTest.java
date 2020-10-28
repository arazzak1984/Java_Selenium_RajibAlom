package Using_Array_In_Realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String ar[] = new String[5];
		ar[0]="Ashik Bhai";
		ar[1]="Dedar Bhai";
		ar[2]="Sohag Bhai";
		ar[3]="Khaled Bhai";
		ar[4]="Babul Bhai";
		
		for(int i =0; i<ar.length;i++) {
			System.out.println(ar[i]);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(ar[i]);
		Thread.sleep(2000);
		
		
		}	

	}

}
