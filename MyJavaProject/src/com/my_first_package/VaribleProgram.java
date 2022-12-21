package com.my_first_package;

public class VaribleProgram {
	
	public void Shiv() {     //here im created static method
		int A = 100;
		double B = 99.99d;
		float C = 999999.9f;
		char D = 'Q';
		
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}
	

	
	public static void main (String args[])    // main method
	{
		VaribleProgram Cat = new VaribleProgram();    // i created here object
		Cat.Shiv();        // i called here static method
		
		
		
		
	}

}
