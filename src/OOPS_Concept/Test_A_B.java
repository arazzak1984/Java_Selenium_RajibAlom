package OOPS_Concept;

public class Test_A_B {

	public static void main(String[] args) {

		B_Inheritence obj = new B_Inheritence();
		
		obj.methodA();            // This property of A
		obj.methodB();           // This property of A
		obj.multiplication();   // This property of B
		
		Multilevel_C obj_c = new Multilevel_C();
		
		obj_c.methodA();
		obj_c.methodB();
		obj_c.multiplication();
		
		
		
		
		
	}

}
