package TestNG_FW;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingTest {
	
	@BeforeMethod
	public void initialSteps() {
		System.out.println("Open app");
		
	}
	
	@Test(groups= {"smoke"})
	public void rajibChow() {
		
		System.out.println("i wanna eat rice");
		
	}
	
	@Test
	public void towhidAl() {
		System.out.println("wanna go back");
		
	}
	
	@Test
	public void towhidAlom() {
		System.out.println("wanna go back");
		
	}
	
	@Test
	public void towhidAlom1() {
		System.out.println("wanna go back");
		
	}
	@Test(groups= {"smoke"})
	public void towhidAl2() {
		System.out.println("wanna go back");
		
	}
	
	@Test(groups= {"smoke"})
	public void dadaMiah() {
		System.out.println(" wanna buy bank of america");
		
	}
	
	
	@AfterMethod
	public void closingApp() {
		System.out.println("closing app");
		
	}
	

}
