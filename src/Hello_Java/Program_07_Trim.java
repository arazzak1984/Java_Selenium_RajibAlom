package Hello_Java;

public class Program_07_Trim {

	public static void main(String[] args) {
		
		String a = "rajib@yahoo.com,34567";
		
		
		String[] format = a.split(",");
		
		String user =format[0].trim();
		String password =format[1].trim();
		
		String b = "    Welcome to Java     ";
		String aftertrim = b.trim();
		
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(aftertrim);*/
		
		System.out.println(user);
        System.out.println(password);
        
        
	}

}
