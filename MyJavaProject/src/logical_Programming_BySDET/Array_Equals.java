package logical_Programming_BySDET;

import java.util.Arrays;
import java.util.Iterator;

public class Array_Equals {
	static int a1[]= {10,20,30,40,50};
	static int a2[]= {10,20,30,40,50};
	
	public static void M1() {
		
		boolean Status = Arrays.equals(a1, a2);
		
		if (Status == true ) {System.out.println("Both Arrays are same .. ");}
		else {System.out.println("Both Arrays are NOT same .. ");}
	}
	public static void M2() { int count =0;
		if (a1.length==a2.length) {	for (int i = 0; i<a1.length;i++) {if (a1[i]!=a1[i]) {count++;}}	}					
		else {System.out.println("Arrays not equals At Counting");}
		
		if (count == 0) {System.out.println("Arrays Are equals after counting");}
		else {System.out.println("Arrays not equals after counting ");}
	}

	public static void main(String[] args) {

		//M1();
		M2();
		
	}

}
