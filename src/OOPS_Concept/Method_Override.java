package OOPS_Concept;

public class Method_Override {
	
	public void alomOverride() {
		String s = "Rajiv";
		System.out.println(s);
	}
}
	class methodOverrideB extends Method_Override {
		public void alomOverride() {
			String str = "Alom is learnig selenium";
			System.out.println(str);
		}
	

	public static void main(String[] args) {
		Method_Override sd= new methodOverrideB(); // U have to do top casting;
		sd.alomOverride();

	
	}
}
