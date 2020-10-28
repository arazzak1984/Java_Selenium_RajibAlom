package Hello_Java;

import java.time.LocalTime;

public class tiime {

	public static void main(String[] args) {
		
	
		for(char c='a'; c<='z'; c++ ) {
			System.out.print(c+" ");
		}
		
		LocalTime obj = LocalTime.now();
		System.out.println(obj);

	}

}
