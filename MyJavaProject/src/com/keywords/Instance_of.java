package com.keywords;

public class Instance_of {

	public static void main(String[] args) {
       
		Instance_of o = new Instance_of();               // in variable cration we cant use number and any sing 
		System.out.println(o instanceof Instance_of);     // this instanceof keyword use to check object is reated correctly or not 
		
		keyword1 o1 = new keyword1();
		o1.print ();
		System.out.println(o1 instanceof keyword1);      // here when we create object from extended calss then also instance of give true answer		
         
		Instance_of A = null;
		System.out.println(A instanceof keyword1); 
		
		
	}
}
 class keyword1 extends Instance_of {                     // here we cant define public or private class bcoz if we want this then we need to do it in parent class
	                                                      // whenever we write main method in extended calss then it not give error but not give output also
	public void print ()
	{
	    System.out.println("Massage from extend class Kyword1"); 
	}
}
 