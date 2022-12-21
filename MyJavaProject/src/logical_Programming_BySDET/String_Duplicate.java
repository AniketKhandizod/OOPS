package logical_Programming_BySDET;

import java.util.HashSet;

public class String_Duplicate {

	public static void M1() {
		// int A[]= {1,2,3,5,2,1,4,5,8,7,9,6,5,2,1,5,4,3,6,5,4,8,6,5,5,9,5};
		String A[] = { "java", "c", "c++", "paython", "java" };
		boolean flag = false;

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {

				if (A[i].equals(A[j])) {
					System.out.print(A[i]);
					flag = true;
				}

			}
		}
		if (flag == true)
			System.out.println(" = Duplicate found");
		else {
			System.out.println("Not found");
		}
	}

	public static void M2() {

		String A[] = { "java", "c", "c++", "paython", "java", "paython", "java" };
		HashSet obj = new HashSet();   // in that we cant add duplicate string
		boolean flag = false;
		
		for (String S : A) {
			if (obj.add(S)==false) {
				System.out.println("Found Duplicate Element : "+S);
				flag = true;
			}
		}
		if (flag == true)
			System.out.println(" = Duplicate found");
		else {
			System.out.println("Not found");
		}
		
	}

	public static void main(String[] args) {

		//M1();
		M2();

	}

}

















