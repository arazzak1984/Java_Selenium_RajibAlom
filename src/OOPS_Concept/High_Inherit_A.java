package OOPS_Concept;

public class High_Inherit_A {
	
	void Rajib (){
		System.out.println(" Rajib Learning inheritencs....");
	}
}
	class High_Inherit_B extends High_Inherit_A{
		
		void alom() {
			System.out.println("This is Alom Saheb.....");
		}
		
	}
	
	class High_Inherit_C extends High_Inherit_A {
		
		void dadaBhai() {
			System.out.println("Dada bhai is the Boss........");
		}
		

	public static void main(String[] args) {
		
		High_Inherit_C obj_c = new High_Inherit_C();
		
		obj_c.Rajib();
		obj_c.dadaBhai();
		

	}

	}
