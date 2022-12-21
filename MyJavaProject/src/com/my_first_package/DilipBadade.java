package com.my_first_package;


public class DilipBadade {
	static int AAA = 100;  // if we want to execute this veribale into the static method then we need to write static keyword infrontm of variable
    static int BBB = 550;  // if we want to execute this variable in non static method then writting static keyword in front of variable not mandatory
    
    
    
	public static void velocityClass()
	{
		int XXX = -1234567890;    // local veriable and which is accesible only in method body
		System.out.println(XXX);
		System.out.println(AAA);
		
	}
	
	public void velocityClass1(){
		System.out.println(BBB);
	}
	
	
	

	public static void main(String[] args) {
		
		/*byte A = -12;     // byte store negative value  and byte can store value with bracket also
		short B = -5584 ;   // short store negative value 
		float C = -85.33f;  // float store negative value  as well as decimal value also and without "f" we cant run program
		double D = -55.369; // float store negative value  as well as decimal value also and with small d and without also they sucessfully runes
		long E = -9727884; // long can store only 9 digit value and can store negative value but not decimal value
		int F = -1234567890; //they able to store 10 digit value and with negative sign but they cant store decimal value
		char G = ('@');		
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println(G);*/
		velocityClass();
		
		// now here we are goinmg to creat object
		DilipBadade XYZ = new DilipBadade();
		XYZ.velocityClass1();
		
		
		
		
		
		
		// non primitive varables - String , Classes , Interface , Arrays 

	}

}
