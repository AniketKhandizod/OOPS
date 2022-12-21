
package Patterns;
import java.util.Scanner;
public class Triangle_Right_Face {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("How much big size of Right face traingle u want : ");
		int A = SC.nextInt();
		
       for (int i=1;i<=A;i++) {
    	   for (int j=1;j<=i;j++) {
    		   System.out.print("#");
    	   }
    	   System.out.println(" ");
       }
       
		 for (int i=1;i<=A;i++) {
	    	   for (int j=A;j>=i;j--) {
	    		   System.out.print("@");
	    	   }
	    	   System.out.println(" ");
	       }SC.close();
	}

}
