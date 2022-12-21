package PRactice_Delete;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Integgers {
	private void M1() {
		String A = "Aniket";
		StringBuffer SB = new StringBuffer();
		SB.append(A);
		SB = SB.reverse();
		System.out.println(SB);
	}

	private void M2() {
		String A = "Aniket";
		String rev = "";
		char S[] = A.toCharArray();
		for (int i = A.length() - 1; i >= 0; i--) {
			rev = rev + S[i];
		}
		System.out.println(rev);
	}

	private void M3() {

		String A = "Aniket";
		String rev = "";
		String[] K = A.split("");
		for (int i = A.length() - 1; i >= 0; i--) {
			rev = rev + K[i];
		}
		System.out.println(rev);
	}

	private void M4() {
		int A = 10, B = 20, C;
		C = A;
		A = B;
		B = C;
		System.out.println(A + " " + B);
	}

	private void M5() {
		int A = 10, B = 20;
		System.out.println(A + " " + B);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println(A + " " + B);
	}

	private void M6() {
		String A = "SSSA";

		StringBuffer SB = new StringBuffer(A);
		SB = SB.reverse();

		if (A.equals(SB.toString())) {
			System.out.println("AAA");
		}
	}

	private void M7() {
		int A = 0, B = 1, C = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println(C);
			C = A + B;
			B = A;
			A = C;
		}
	}
	private void M8() {
		int Z = 0;
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 0, 5, 6, 8, 7, 5, 4, 0 };

		while (Z < 2) {
			int K;
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < i; j++) {
					if (arr[i] > arr[j + 1]) {
						K = arr[i];
						arr[i] = arr[j + 1];
						arr[j + 1] = K;
					}
				}
			}
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					arr[i] = 0;
				}
			}
			Z++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	private void M9() {

		int A=123456;int Y=0;
		
		while(A!=0) {
			Y=Y*10+(A%10);
			A=A/10;
		}
		System.out.println(Y);
	}

	public static void main(String[] args) {

	}

}








