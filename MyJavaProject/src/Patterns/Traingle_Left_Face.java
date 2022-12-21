package Patterns;

import java.util.Scanner;

public class Traingle_Left_Face {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("How many Starts u want buddy : ");
		int A = SC.nextInt();
		
           for (int i=1;i<=A+1;i++) {       // Here i added one bcoz to balance center line 
        	   for (int j=A; j>=i;j--) {
        		   System.out.print(" ");
        	   }
        	   for (int k = 1;k<=i;k++) {
        		   System.out.print("*");  
        	   }
        	   System.out.println();        	   
           }
           
           for (int i=1;i<=A;i++) {
        	    {for (int k = 1;k<=i;k++)
        		   System.out.print(" ");
        	    }
        	    for (int j=A; j>=i;j--)
        	    {
        		   System.out.print("*");  
        	    }
        	   System.out.println();
	}
           SC.close();

}
}
