package Hello_Java;

import java.util.Scanner;

public class FindingGrad {

	public static void main(String[] args) {
		
	      Scanner reader = new Scanner(System.in);
	      
	      System.out.println(" Enter mark of a student ");
	      int mark = reader.nextInt();
	      
	      
	      if(mark<= 100 && mark>=90) {
	    	  System.out.println("Student got A+");
	      }else if (mark<=89 && mark >=80) {
	      System.out.println("Student got A ");
	      }else 
	      {
	    	  System.out.println("Student got dabba");
	      }

	}

}
