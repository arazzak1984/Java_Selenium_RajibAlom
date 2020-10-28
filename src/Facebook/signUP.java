package Facebook;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signUP {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*String firstname = "Rajib_Alom"; 
		String[] first = firstname.split("_");
		String firstuser=first[0].trim();
		String lastuser=first[1].trim();*/
		
		/*
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rajib");
		al.add("Alom");
		al.add("rajib_1996@yahoo.com");
		
		System.out.println("Total size:= "+al.size());
		
		String firstuser = al.get(0);
		String lastnameuser = al.get(1);
		String emailid = al.get(2);
		
		driver.findElement(By.name("firstname")).sendKeys(firstuser);
		driver.findElement(By.name("lastname")).sendKeys(lastnameuser);
		driver.findElement(By.name("reg_email__")).sendKeys(emailid);
		
		Select dd = new Select(driver.findElement(By.id("month")));
		//dd.selectByVisibleText("Jan");
		dd.selectByValue("10");
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_7')]")).click();
		driver.findElement(By.name("websubmit")).click();
		*/
		
		List<WebElement> radiobutton = driver.findElements(By.name("sex"));
		System.out.println(radiobutton.size());
		
		for(int i=0; i<=radiobutton.size(); i++) {
			radiobutton.get(1).click();
		}

	}

}
