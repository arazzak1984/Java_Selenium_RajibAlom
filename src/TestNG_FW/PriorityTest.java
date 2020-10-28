package TestNG_FW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PriorityTest {
 
	@Test(priority =3)
  public void bmw() {
		System.out.println("This is BMW");
  }
  
  
  @Test(priority =2)
  public void audi() {
	  System.out.println("This is Audi");
  }
 
  
  @Test(priority =1)
  public void honda() {
	  System.out.println("This is Honda");
  }
 
  
  @Test(priority =4)
  public void hummer() {
	  System.out.println("I wanna buy Hummer");
  }
 
  
  @Test(priority =5)
  public void tesla() {
	  System.out.println("This is Tesla Alom");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
