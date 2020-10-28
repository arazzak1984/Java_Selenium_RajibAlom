package Using_Array_In_Realtime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class UsingTwoDim {
	WebDriver driver;
	
	@BeforeClass
	public void log() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test(dataProvider="getData")
	public void login(String email, String paa) throws InterruptedException {
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(paa);
		Thread.sleep(2000);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object twodar[][]= new Object [3][2];
		
		// First data set
		twodar[0][0]="asikbhai@yahoo";
		twodar[0][1]="34588@#";
		
		//Second Data set
		twodar[1][0]="didar@gmail";
		twodar[1][1]="88";
		
		// Thrid set
		twodar[2][0]="babul@hotmail.com";
		twodar[2][1]="987";
		
		
		return twodar;
	}

}
