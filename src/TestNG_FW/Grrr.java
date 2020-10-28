package TestNG_FW;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grrr {
	
	
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("Open Application");
	  }
	
	
	@Test
  public void login() throws InterruptedException {
		System.out.println("One Star-1");
		
  }
	

	@Test(groups= {"rajariyan"})
	  public void logingmail3() throws InterruptedException {
			System.out.println("This is Star-2");
	  }
	
	@Test
	  public void signhotmail1() throws InterruptedException {
			System.out.println("This is code_3");
	  }
	
	@Test
	  public void login2() throws InterruptedException {
			System.out.println("This is Star-4");
		
	  }
		

	@Test(groups= {"rajariyan"})
		  public void logingmail() throws InterruptedException {
				System.out.println("This is Star-5");
		  }
		
	@Test
		  public void signhotmail() throws InterruptedException {
				System.out.println("This is Star-6");
		  }
	 

	
	

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close Application");
  }


}
