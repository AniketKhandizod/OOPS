package UDEMY;

import java.util.HashSet;
import java.util.Set;

public class arrayRepeted {

	public static void M1() {
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		int k = 0, count = 0;

		for (int i = 0; i < a.length; i++) {
			if (k != a[i]) {
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " is " + count + " times");
				k = a[i];
				count = 0;
			}
		}
	}
	public static void M2() {
		Set<Integer> A =new  HashSet<Integer>();
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		for (int i = 0; i < a.length; i++) {
			A.add(a[i]);
		}
		System.out.println(A);
		
	}
	
	public static void main(String[] args) {

		M2();
	}
}
