package Hello_Java;

public class GiveNTake {

	public static void main(String[] args) {
		
		int a = 500;
		int b = 600;
		
		System.out.println("Value of a before swaping-> "+a);
		System.out.println("Value of b before swaping-> "+b);
		
		int temp;
		temp = a;
		a= b;
		b = temp;
		
		System.out.println("Value of a after swaping-> "+a);
		System.out.println("Value of b after swaping-> "+b);
		

	}

}
