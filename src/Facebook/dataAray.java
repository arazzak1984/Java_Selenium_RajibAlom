package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataAray {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*String son[] = {"ayaan", "xyz"};
		
		for(int i=0;i<son.length;i++) {
		
//String raj[]= new String[3];
		
	//	raj[0]="Sumon Khan";
		//raj[1]="Ashik Bhai";
		//raj[2]="Dedar Bhai";
		
		//System.out.println(raj.length);
		
		//for(int i=0;i<raj.length;i++) {
			//System.out.println(raj[i]);
		*/
			
		String twodim[][]=new String [2][2];
		twodim[0][0]="sumonkhan";
		twodim[0][1]="k";
		twodim[1][0]="ra";
		twodim[1][1]="sal";
		for(int i=0;i<twodim.length;i++) {
			for(int j=0;j<twodim.length;j++) {
			System.out.println(twodim[i][j]);
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(twodim[i]);
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).sendKeys(twodim[i]);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		}
					
		}
		
		
	}

}
