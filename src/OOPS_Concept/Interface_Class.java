package OOPS_Concept;

public class Interface_Class implements Interface_Concept {

	@Override
	public void rc() {
		System.out.println("Rajib is IT engineer");
	}

	@Override
	public void tc() {
		System.out.println("Towhid is a good manual Tester who knows what is TC");
	}

	@Override
	public void rc1() {
		System.out.println("Towhid");
		
	}

	@Override
	public void tc1() {
		System.out.println("Rajib");
		
	}
	
public static void main(String[] args) {
 Interface_Class ob = new Interface_Class();
	ob.rc();
	ob.rc1();
	ob.tc();
	ob.tc1();

	}

}
