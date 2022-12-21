package logical_Programming_BySDET;

import java.util.Arrays;

public class Array_Serch {
	static private void M1() {

       int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		int find = 50,loop=0;
		boolean flag = false;
		
		for (int STO :a){
			
			if (STO == find) {System.out.println("Value found at index : " + loop);;flag = true;break;}loop++;
		}
		if (flag == false) {
			System.out.println("Match not found ");
		}
		
	}
	static private void Binary_Serch_01() {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		boolean flag = false;
		int key =101;
		int l = 0;
		int h=a.length-1;
		
		while(l<=h) {
			int m=(l+h)/2;
			
			if (a[m]==key) {
				System.out.println("Element Found");
				flag = true;
				break;
			}
			if (a[m]<key) {
				l=m+1;
			}
			if (a[m]>key) {
				l=m-1;
			}
		}
		if (flag == false) {
			System.out.println("Element not found ");
		}
	}
	static private void Binary_Serch_02() {
	 int a[]= {10,20,30,40,50,60,70,80,90,100};
	
		System.out.println(Arrays.binarySearch(a, 10)); //give negative values if not found
	}

	public static void main(String[] args) {

		//M1();
		//Binary_Serch_01() ;
		Binary_Serch_02();
		
		
	}

}
















