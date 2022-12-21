package com.my_first_package;

public class DemoPrograme {
	
	public static void Dilip() {              //static method
		
		System.out.print("Hello Dilip");
		System.out.println(" How are you?");
	}
	
	public void Pragati() {                   //non static method
		
		System.out.println("Hello Pragati");
	}
	
	public static void main (String args [])   // main method
	{
		Dilip();  // here we call static method
		
		
		DemoPrograme Aniket = new DemoPrograme();  // we created one object 
		Aniket.Pragati();                          // we called here one non static method
		
		
	}

}
