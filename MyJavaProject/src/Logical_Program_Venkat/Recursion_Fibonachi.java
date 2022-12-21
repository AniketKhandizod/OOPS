package Logical_Program_Venkat;

import java.util.Scanner;

public class Recursion_Fibonachi {
	
	static int previous =0,next=1,temp=0;
	
	public static void Fibonacci (int IN) {
		if (IN >0) {
			System.out.print(previous+" ");
			temp = previous + next ;
			previous=next;
			next = temp;
			System.out.println(" "+IN+" ");
			Fibonacci(IN-1);
			}
	}

	public static void main(String[] args) {

		System.out.println("inpute = ");
		Scanner SC = new Scanner(System.in);
		int IN = SC.nextInt();
		Fibonacci(IN);
		
		
	}

}
