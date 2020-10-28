package OOPS_Concept;

public class Encap_Concept {
	
	private String rajibname;
	private int rajibsalary;

	public static void main(String[] args) {
		
		Encap_Concept trds = new Encap_Concept();
		
		trds.setRajibname("Rajib Tester");
		trds.setRajibsalary(100000);
		
		System.out.println("This is Tester name who make 100k: "+trds.getRajibname());
		System.out.println("This is rajibs annual salary:  "+trds.getRajibsalary());

	}
	
	public String getRajibname() {
		return rajibname;	
	}
	
	public void setRajibname(String rajibname) {
		this.rajibname= rajibname;
		
		
	}
	
	public int getRajibsalary() {
		return rajibsalary;	
	}
	
	public void setRajibsalary(int rajibsalary) {
		this.rajibsalary= rajibsalary;
		
		
	}
	

}
