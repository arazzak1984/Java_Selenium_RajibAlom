package ThisSuper;

public class this_1 {
	
	int a=50;
	static int b= 2;
	public static void main(String[] args) {
		this_1 obj = new this_1();
		obj.add();
		obj.sub(b);
		
		
	}
	
	void add() {     // this keyword always refer global variable.
		int a =40;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	void sub(int b) {
		b=5;
		System.out.println(this.b);
		System.out.println(b);
		
	}

}
