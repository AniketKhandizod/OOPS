package com.keywords;

public class This_keyword {
	
	 int A; 
	 String name;
	 
	public  void shortt(int A, String name){
	this.A = A;
	this.name = name;
		System.out.println(A);
		System.out.println(name);
	}

	public static void main(String[] args) {
		This_keyword A = new This_keyword();
		A.shortt(55,"Aniket");
	}

}
