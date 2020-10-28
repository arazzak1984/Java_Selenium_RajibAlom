package Hello_Java;

import java.util.Scanner;

public class Program_02_Scannar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of int a: ");
		
		int a= sc.nextInt();
		
		System.out.println("Enter the value of int b: ");
		int b= sc.nextInt();
		
		int c=a+b;
		
		System.out.println("Addition of a and b = " +c);
		

	}

}
