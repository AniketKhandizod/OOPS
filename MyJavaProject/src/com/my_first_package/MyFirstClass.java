package com.my_first_package;   // package

public class MyFirstClass {
	
	public static void loginUsername()                              //Static method
	{
		System.out.println("This is my static Method 1st");
		System.out.println('A'+'@'-'*');
		System.out.println("MyFirstClass static");
		System.out.println("------------------------------------Static 1 end----------------------------------------");
	}
	public  void loginPassword() {                                //non Static method
		
		System.out.println("This is my non static method 1st ");
		System.out.print("Aniket is a : " + "SDET ");
		System.out.println(" = Software develpoment engineer tester");
		System.out.println("MyFirstClass non static");
		System.out.println("------------------------------------non Static 1 end----------------------------------------");
	}   
	
	public static void main (String args[]) {
	  //loginUsername();                          //Type 1 to call static method 1st    
		MyFirstClass.loginUsername();             //Type 2 to call static method 1st
	//------------------------------------------------------------------------------------------------------
		MyFirstClass a1 = new MyFirstClass ();    //To call non static method 1st		
		a1.loginPassword();                       //Define non static method
	//------------------------------------------------------------------------------------------------------
		MySecondClass a3 = new MySecondClass ();  //To call non static method From second class		
		a3.loginHash();                           //Define non static method From second class
		a3.loginDash();                           // we can define from same class method multiple time in same class method object
	//------------------------------------------------------------------------------------------------------
		MyThiredClass.loginSmash();                //To static method From Thired class
	//------------------------------------------------------------------------------------------------------
		System.out.println("Hello Aniket , this is directly main method");        //Directly calling from main method
		System.out.println("///////////////////////////////////////////////////////////"); 
	//------------------------------------------------------------------------------------------------------
		MyFourthClass Variable = new MyFourthClass ();
		Variable. loginGrass();
	//------------------------------------------------------------------------------------------------------
		LoopClass.loop();                          // Calling loop class
		
		
		}
	
	
}
