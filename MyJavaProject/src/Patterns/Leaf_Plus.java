package Patterns;

import java.util.Scanner;

public class Leaf_Plus {
	
	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("GIve inpute number : ");
		int A = SC.nextInt();
		System.out.println("Give String input : ");
		String S = SC.next();
		
          for(int i = 1 ; i<=A-1 ; i++) {
        	   for (int j = A ; j>=i ; j--) {
        		   System.out.print(" ");}
        	   
        	   for (int k=1;k<=i;k++) {
        			if (k<=1||k>=i) {System.out.print(S);}        			
        			else {System.out.print(" ");}}
        			
        	   for (int k=2;k<=i;k++) {
        		   
            		if (k>=i) {System.out.print(S);}        			
            		else {System.out.print(" ");}}
        			
        		
        	   System.out.println(" ");
        	   }
           
           for(int i = 1 ; i<=A ; i++) {
        	   for (int j = 1 ; j<=i ; j++) {  // for space
        		   System.out.print(" ");}
        	   
        	   for (int k=A;k>=i;k--) {       // for incline line & space
        			if (k>=A||k<=i||i<=1) {System.out.print(S);}        			
        			else {System.out.print(" ");}}
        			
        	   for (int k=A-1;k>=i;k--) {     // for next incline line & space
        		   
            		if (k<=i||i<=1) {System.out.print(S);}        			
            		else {System.out.print(" ");}}
        			
        		
        	   System.out.println(" ");
        	   }
           SC.close();
           }

}
