package Patterns;

import java.util.Scanner;

public class Pyramid_Time {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("How many big u want : ");
		int A = SC.nextInt();
		for (int i=1; i<A; i++){   //it just print lines
			for (int j=1; j<=i; j++ )   // but it print diffrent logics
		      {		    		
		       System.out.print(" ");} 
		      for (int j=A; j>=i; j--)
	    { 		      
		       System.out.print("* ");   
		} 		  
		       System.out.println();   
		}  			 
	     for (int i=1; i<A+1; i++){ 
			for (int j=A; j>=i; j--)
			      {		    		
			      System.out.print(" ");} 		
			for (int j=1; j<=i; j++ ){ 		      
			      System.out.print("* ");   
			} 		  
			      System.out.println();   
			}  
	     SC.close();
	}

}
