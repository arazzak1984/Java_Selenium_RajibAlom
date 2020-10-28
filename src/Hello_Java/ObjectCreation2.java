package Hello_Java;

public class ObjectCreation2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		//ObjectCreation2 alom = new  ObjectCreation2();
		
		
		// ObjectCreation2 alom = ObjectCreation2.class.newInstance();
		
		rajibBhai();
		//alom.dadaBhai();
		
		
	}
	
	void dadaBhai() {
		
		int  a =4;
		int b = 6;
		System.out.println("this sum of a and b" +(a+b));
		
	}
	
	static void rajibBhai() {
		
		System.out.println("this is a method");
		
	}

}
