package OOPS_Concept;

public class Easy_Way {
	
	private String towhidname;
	private int towhidage;
	
	public String getTowhidname() {
		return towhidname;
	}

	public void setTowhidname(String towhidname) {
		this.towhidname = towhidname;
	}

	public int getTowhidage() {
		return towhidage;
	}

	public void setTowhidage(int towhidage) {
		this.towhidage = towhidage;
	}

	

	public static void main(String[] args) {
		Easy_Way tb= new Easy_Way();
		tb.setTowhidname("Towhid Lawyer");
		tb.setTowhidage(47);
		
		System.out.println(tb.getTowhidname());
		System.out.println(tb.getTowhidage());

	}
	
	

}
