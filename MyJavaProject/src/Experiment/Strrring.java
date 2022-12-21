package Experiment;

import java.util.ArrayList;
import java.util.List;

public class Strrring {

	public static void main(String[] args) {

		String A = "Aniket Rahul Khandizod";
		String B = "Aniket Rahul Khandizod";
		String E = new String("Aniket Rahul Khandizod");

		/*
		 * System.out.println(A.equals(B)); System.out.println(A==B);
		 * System.out.println(A==E);
		 */

		try {
			char C[] = A.toCharArray();
			char D[] = E.toCharArray();
			char F[] = B.toCharArray();
			int count = 0;
			ArrayList<Boolean> Store = new ArrayList<>();

			for (char comp : C) {

				Store.add(comp == D[count] && D[count] == F[count]);
				count++;

			}
			if (Store.contains(false)) {
				System.out.println("All statment not same");
			} else {
				System.out.println("All statments are same");
			}
		} catch (Exception Z) {
			System.out.println("Some one String is bigger " + Z.getMessage());
		}

	}

}
