package OOPS_Concept;

public class This_Key {
	
	int a=456;
	
	void useThis() {
		int a= 600;
		System.out.println(a+this.a);
	}

	public static void main(String[] args) {
		
		This_Key obj= new This_Key();
		obj.useThis();

	}

}
