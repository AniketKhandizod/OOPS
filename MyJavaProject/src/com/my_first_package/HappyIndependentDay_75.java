package com.my_first_package;

public class HappyIndependentDay_75 {
	
	static int Value_1 = 88;                       // Static / class varable 
    float Value_3 = 99.99f;                        // global/instance variable (this variable type help only non static method)
	
	public static void Staticc()                   // static method
	{
		
		int Value_2 = 100;		                   // local variable 2
		System.out.println("Static value output = " + Value_1 * Value_2);
	}
	
	public void non_static()                    // non static method
	{
		
		float Value_4 = 88.3f;		                 // local variable 4
		System.out.println("Non-Static value output = " +Value_3 / Value_4);
		
	}
	
	

	public static void main(String[] args) {   // main method
		Staticc() ;                             // i call here static method
		
		HappyIndependentDay_75 Dilip = new HappyIndependentDay_75(); // we created object here
		Dilip.non_static();
				

	}

}
