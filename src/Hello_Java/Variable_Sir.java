package Hello_Java;

public class Variable_Sir {

	public static int a = 5;
	 int b= 7;
	
	public static void main(String[] args) {
		
		//int a = 5;
		//int b= 6;
		
		//int sum = a+b;
		//System.out.println(sum);
		//Variable_Sir.add();
		Variable_Sir ref = new Variable_Sir();
		ref.add();
		
	}
	
	public  void add() {
		int sum = a+b;
		System.out.println(sum);
	}

}
