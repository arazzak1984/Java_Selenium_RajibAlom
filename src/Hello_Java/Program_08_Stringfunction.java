package Hello_Java;

public class Program_08_Stringfunction {

	public static void main(String[] args) {
		
		String x = "Rajib and Towhid will make 100k";
		
		System.out.println(x);
		
		String afterreverse = new StringBuffer(x).reverse().toString();
		System.out.println(afterreverse);
		
		String straight = new StringBuffer(afterreverse).reverse().toString();
		System.out.println(straight);
		

	}

}
