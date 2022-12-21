package UDEMY;

import java.io.IOException;

class AA {
	public void M1() throws IOException, Exception {
		System.out.println("AA");
	}
}

public class Overriding01 extends AA {
	
	
	@Override
	final public void M1() throws Exception {

		int D = 1;

		long A[][][] = { { { 01, 02, 03 }, { 04, 05, 06 }, { 07, 8, 9 } },
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };

		long comp = A[0][0][0];
		for (long[][] ls : A) {
			for (long[] ls2 : ls) {
				for (long ls3 : ls2) {
					switch (D) {
					case 0:
						if (comp > ls3) {
							comp = ls3;
						}
						break;
					case 1:
						if (comp < ls3) {
							comp = ls3;
						}
						break;
					}
				}
			}
		}
		System.out.println(comp);

		long k =  A[0][0][0];
		int Zaxis = 1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				switch (D) {
				case 0:
					if ((A[Zaxis][i][j] < k)) {
						k = A[Zaxis][i][j];
					}
					break;
				case 1:
					if ((A[Zaxis][i][j] > k)) {
						k = A[Zaxis][i][j];
					}
					break;
				}
			}
		}
		System.out.println(k);
	}
	
	public void M2() throws Exception {
		
		int comp = 100;
		int A[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 6, 2, 9 } };

		for (int is[] : A) {
			for (int Z : is) {
				if (comp > Z) {
					comp = Z;
				}
			}
		}
		System.out.println(comp);

	}

	public static void main(String[] args) throws Exception {

		Overriding01 A = new Overriding01();
		A.M2();
		
	}

}
