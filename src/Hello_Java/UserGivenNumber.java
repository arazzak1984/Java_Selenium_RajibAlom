package Hello_Java;

import java.util.Scanner;

public class UserGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plz enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("User gave this number: "+number);
		

	}

}
