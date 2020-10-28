package Hello_Java;

public class ConstConcept {
 int x;
 public  int c;
 public  int d;
	public ConstConcept() {
		System.out.println("This is First Constructor invoked");
	}
	
	public ConstConcept(int x) {
		System.out.println("This is Second Constructor");
		this.x=x;
		
	}
	
	public ConstConcept(int c, int d) {
		System.out.println("This is Third Constructor");
		this.c=c;
		this.d=d;
		
	}

	public static void main(String[] args) {
		ConstConcept raj = new ConstConcept();
		
		ConstConcept alom = new ConstConcept(200);
		System.out.println("Valu of x is "+alom.x);
		
		ConstConcept alomkhan = new ConstConcept(400,500);
		System.out.println("Value of C and D is "+alomkhan.c+ " " +alomkhan.d);
		
		


	}
	
	

}
