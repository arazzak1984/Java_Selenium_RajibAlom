package TestNG_FW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class classAnnot {
 
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Open Application");
	  }
	
	  @Test
	  public void Yahoo() {
			System.out.println("This is code_1");
	  }
				
		@Test
		  public void gmail() throws InterruptedException {
				System.out.println("This is code_2");
		  }
		
		@Test
		  public void hotmail() throws InterruptedException {
				System.out.println("This is code_3");
		  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Close Application");
	  
  }

}
