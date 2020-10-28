package ThisSuper;

public class Super_2 extends Super_1 {
	
	String a = "Rahul of QA";
	
	public Super_2() {
		System.out.println("Child constractor");
	}
	
	public void getData() {
		
		super.getData();
		System.out.println("++++++++++++");
		System.out.println(a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		Super_2 ob = new Super_2();
		ob.getData();
		
		
		
	}

}
