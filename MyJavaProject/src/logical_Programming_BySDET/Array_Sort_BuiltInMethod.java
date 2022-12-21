package logical_Programming_BySDET;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_BuiltInMethod {
	
	public static void M1() {	
	 int a[]= {6,5,8,9,7,2,4,3,1,1,5,4,8,5,2,4,8,5,6,5,8,7,5,4,2,1,3,3,6,5,4,8,9,6,5,4,5,89,98,85,5,56,5,5,8};

		System.out.println("Arrays element before sorting : "+Arrays.toString(a));		
		Arrays.parallelSort(a);
		System.out.println("Arrays element After  sorting : "+Arrays.toString(a));		
	}
	
	public static void M2() {
	int a[]= {6,5,8,9,7,2,4,3,1,1,5,4,8,5,2,4,8,5,6,5,8,7,5,4,2,1,3,3,6,5,4,8,9,6,5,4,5,89,98,85,5,56,5,5,8};

		System.out.println("Arrays element before sorting : "+Arrays.toString(a));		
		Arrays.sort(a);
		System.out.println("Arrays element After  sorting : "+Arrays.toString(a));	
	}
	public static void M3() {   // write in reverse
		 Integer a[]= {6,5,8,9,7,2,4,3,1,1,5,4,8,5,2,4,8,5,6,5,8,7,5,4,2,1,3,3,6,5,4,8,9,6,5,4,5,89,98,85,5,56,5,5,8};

		System.out.println("Arrays element before sorting : "+Arrays.toString(a));		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Arrays element After  sorting : "+Arrays.toString(a));
	}

	public static void main(String[] args) {

		M1();
		M2();
		M3();
		
		
		
	}

}
