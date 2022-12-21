package Patterns;
import java.util.Scanner;
public class Pyramid_Inverted {

	public static void main(String[] args) {
			 Scanner SC = new Scanner (System.in);
			 System.out.println("Give values : ");
			 int A = SC.nextInt();
			 
			for (int i=1; i<A; i++){ 
				for (int j=1; j<=i; j++ )
			      {		    		
			         System.out.print(" ");} 
			    for (int j=A-i; j>1; j--)
		    { 		      
			        System.out.print("* " );   
			} 		  
			        System.out.println();   
			}  
			SC.close();
	}}
