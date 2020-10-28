package Hello_Java;
public class Program_10_Array {

	public static void main(String[] args) {
// Single Dimensional:----------------------------------------------------------->>	
	int raj[]= new int[5];
		raj[0]=6;
		raj[1]=7;
		raj[2]=8;
		raj[3]=9;
		raj[4]=10;
		System.out.println("Single dimensional Array size = " +raj.length);
		for(int i=0; i<raj.length; i++) {
			System.out.println("One Dim Array: "+raj[i]);
		}
		
// Two Dimensional:--------------------------------------------------------------->>
		
	int twodim[][]=new int [2][2];
		twodim[0][0]=78;
		twodim[0][1]=79;
		twodim[1][0]=88;
		twodim[1][1]=89;
		
		System.out.println("Two dimensional Array size = " +twodim.length);
		for(int i=0; i<twodim.length; i++) {
			
			for(int j =0; j<twodim.length; j++) {
				
				System.out.println("Two Dim Array: "+twodim[i][j]);	
			}
		}
		
		int c=twodim[0][0]+twodim[0][1];
		System.out.println("Addition of Two Array: "+c);
		
		System.out.println("===================================================================");
		
int todim[][]= new int[3][3];
		
		todim[0][0] = 20;
		todim[0][1] = 30;
		todim[0][2] = 40;
		todim[1][0] = 50;
		todim[1][1] = 60;
		todim[1][2] = 70;
		todim[2][0] = 50;
		todim[2][1] = 60;
		todim[2][2] = 70;
		
		System.out.println("Size of wo dim "+todim.length);
		
		for(int i=0; i<todim.length; i++) {
			for(int j=0; j<todim.length; j++) {
				
					System.out.println("Todim:  "+todim[i][j]);
				}
			}
	}
}
