package logical_Programming_BySDET;

import java.util.Arrays;

public class Arrays_Serailisation {         //Bubble sort

	public static void main(String[] args) {

		int a[]= {6,5,8,9,7,2,4,3,1,1,5,4,8,5,2,4,8,5,6,5,8,7,5,4,2,1,3,3,6,5,4,8,9,6,5,4,5,89,98,85,5,56,5,5,8};		
		
		System.out.println("Array before swap : "+Arrays.toString(a));
		
		for (int i=0;i<a.length-1;i++) {
			for (int j =0;j<a.length-1;j++) {
				if (a[j]>a[j+1]) {
					int REF = a[j];
					a[j]=a[j+1];
					a[j+1]=REF;
				}
			}
			
		}
		System.out.println("Array After  swap : "+Arrays.toString(a));
		
	}
		
}


