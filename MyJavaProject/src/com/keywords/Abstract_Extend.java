package com.keywords;

abstract class A1{                           // when we remove here abstract keyword then is can run directly from main method without extend method
	public void Method0() {
		System.out.println("Hellow from *abstract* class A1");
	}	
	public abstract void method1();          // we cant define here any non static and static method with only smicolan we need to complete this methiod or we need to write abstract keyword there
	
}
class A2 extends A1{	
	public void method1() {
		System.out.println("Hellow from *extend* class A2");
	}
	
}

public class Abstract_Extend {

	public static void main(String[] args) {
		A2 A = new A2();
		A.Method0();
		A.method1();

	}

}
