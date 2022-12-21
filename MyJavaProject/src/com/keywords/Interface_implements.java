package com.keywords;

interface First {  // in abstract we can define any method but in interface we cant define any method
      public  void methodA1();    // we not able to define static method in interface
      public static void AA3() {
    	  System.out.println("Hello from interface");  
      }
}

class XXXX implements First{
	 public  void  methodA1() {
		 System.out.println("Hellow from implement");
	 }	
	 public static void AA3() {
		 System.out.println("Hellow from static method in implements class");
	 }
	 public void AA4() {
		 System.out.println("Hellow from non_static method in implements class");
	 }
}
public class Interface_implements{
	public static void main (String args []) {
		
			 XXXX AA = new XXXX();
			 AA.methodA1();
			 AA.AA4();
	         AA.AA3();
	}
}
