package Hello_Java;
import java.util.ArrayList;

public class program11_ArrayList {

	public static void main(String[] args) {
		
		int a[]= new int[4];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		
		System.out.println("Number of Array is :  "+a.length);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	
		ArrayList<Integer> al = new ArrayList<Integer> ();
        al.add(50);
        al.add(60);
        al.add(100);
        al.add(30);
        al.add(35);
        
        System.out.println("ArrayList size : "+al.size());
        
        for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
        
	}

}
