package OOPS_Concept;

public class Method_Overload {
	public static int a;
	public static int b;
	public static int c;
	
	public int rC(int a) {
		
		a =8;
		System.out.println("This is value of a: "+a);
		return a;
		
	}
    public int rC(int a, int b) {
    	a=9;
    	b=6;
    	int c =a*b;
    	System.out.println("This is value of multiplication: "+c);
    	return c;
		
	}
    
   public int rC(int a, int b, int c) {
	a=2;
	b=3;
	c=5;
	int z= a*b*c;
	System.out.println("This is value of multiplicationa a b c: "+z);
	return z;
		
	}


	public static void main(String [] args){
		Method_Overload obj = new Method_Overload();
		obj.rC(a);
		obj.rC(a, b);
		obj.rC(a, b, c);
		
		
		
		

	}

}
