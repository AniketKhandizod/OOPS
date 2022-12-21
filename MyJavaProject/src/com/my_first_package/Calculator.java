package com.my_first_package;
import java.util.Scanner;
public class Calculator {
	
	public static void Definenum() {
		
        Scanner scan = new Scanner(System.in);        
		
		System.out.println("Which Process do you want to perform ?"); 
		double FirstNumber,SecondNumber,Answer;
		
		System.out.println("Put first value :");
		FirstNumber = scan.nextDouble();                  // write input time first letter in capital
		
		System.out.println("Put first value :");
		SecondNumber = scan.nextDouble();
		
		Answer = FirstNumber + SecondNumber;
		System.out.println("Your Answer of addition : " + Answer);			
	}

	public static void main(String[] args) {
		Definenum() ;
			

	}

}
