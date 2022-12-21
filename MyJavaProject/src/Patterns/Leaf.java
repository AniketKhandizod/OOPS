package Patterns;
import java.util.Scanner;
public class Leaf {
	static String Q = " ";
	static int time ;
	static int x =0;

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		
		System.out.println("Give any input : ");
		int A = SC.nextInt();
		
		System.out.println("Give  Speed of Exicution : ");
		long C = SC.nextInt();
		
		try {while(true) {
		String D[] = {"!","@","#","$","^","*","(",")","{","}","[","]","-","_","+","=",";",":","'",",",".","<",">","?","/","|","x","`","~"};//29
				
           for (int i = 1;i<=A-1;i++) {
        	   
        	   for (int j =A;j>=i;j--){Thread.sleep(C);
        	      System.out.print(Q);}
        	   
        	   for (int j =1;j<=i;j++){Thread.sleep(C);
            	  System.out.print(D[x]);}
        	   
        	   for (int k =2;k<=i;k++){Thread.sleep(C);
        		  System.out.print(D[x]); }
        	   
        	      System.out.println();}
           
         //  System.out.println("Second For loop start");
           
           for (int i = 1;i<=A;i++) {
        	   
        	   for (int j =1;j<=i;j++){Thread.sleep(C);
        	      System.out.print(Q);}
        	   
        	   for (int j =A;j>=i;j--){Thread.sleep(C);
            	  System.out.print(D[x]);}
        	   
        	   for (int k=A-1;k>=i;k--){Thread.sleep(C);
        		  System.out.print(D[x]); }
        	   
        	      System.out.println();
        	     }
           x++; if (x>=29) {x=0;}else {System.out.println(x);}
        	      }
				   }
		catch (InterruptedException ugbuiybubjblhbkjkjnlkjnn) {}
		
		
           
	}

	}
