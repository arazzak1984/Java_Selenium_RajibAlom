package OOPS_Concept;

public class B extends A {
	
	String s = "Alom saab";
	
	void useSuper() {
		super.useSuper();
		System.out.println(super.s);
		
	}
	
	B(){
		super();
		System.out.println("This is a child class constructor");
	}
	
	B(int a){
		super(a); // super
		System.out.println("This is child class parameterized constructor ");
	}

	public static void main(String[] args) {
		
		B obj = new B();
		
		obj.useSuper();
		
		B obj1 = new B(2);

	}

}
