package Patterns;
import java.util.Scanner;
public class Tringle {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("How much big size of intverted traingle u want : ");
		int A = SC.nextInt();
		
       for (int i=1;i<=A;i++) {
    	   for (int j=1;j<=i;j++) {
    		   System.out.print("#");
    	   }
    	   System.out.println(" ");
       }
            
      
	}

}
