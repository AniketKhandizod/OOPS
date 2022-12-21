package Experiment;

import java.util.ArrayList;

public class LineSpinning {
	public static ArrayList<String> M1(String name) {
		if (name.length() % 2 == 0) {
			name = name.concat(".");
			System.out.println(name + "." + name.length());
		}
		char A[] = name.toCharArray();

		ArrayList<String> list = new ArrayList<String>();
//1-----------------------------------------------
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < i; j++) {
				list.add(". ");
			}
			for (int j = name.length(); j > i; j--) {
				if (j == name.length()) {
					list.add(String.valueOf(A[i])+" ");
				} else
					list.add(". ");
			}
		}

//2-----------------------------------------------
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (j == name.length() / 2) {
					list.add(String.valueOf(A[i])+" ");
				} else {
					list.add(". ");
				}
			}
		}

//3-----------------------------------------------
		for (int i = 0; i < name.length(); i++) {
			for (int j = name.length(); j > i; j--) {
				if ((j - 1) == i) {
					list.add(String.valueOf(A[j - 1])+" ");
				} else
					list.add(". ");
			}
			for (int k = 0; k < i; k++) {
				list.add(". ");
			}
		}
//4-----------------------------------------------

		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (i == name.length() / 2) {
					list.add(String.valueOf(A[name.length() - 1 - j]) + " ");
				} else {
					list.add(". ");
				}
			}
		}
//5-----------------------------------------------
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < i; j++) {
				list.add(". ");
			}
			for (int j = name.length(); j > i; j--) {
				if (j == name.length()) {
					list.add(String.valueOf(A[name.length() - i - 1])+" ");
				} else
					list.add(". ");
			}
		}
//6-----------------------------------------------
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (j == name.length() / 2) {
					list.add(String.valueOf(A[name.length() - i - 1])+" ");
				} else {
					list.add(". ");
				}
			}
		}

//7-----------------------------------------------		
		for (int i = 0; i < name.length(); i++) {
			for (int j = name.length(); j > i; j--) {
				if ((j - 1) == i) {
					list.add(String.valueOf(A[name.length() - i - 1])+" ");
				} else
					list.add(". ");
			}
			for (int k = 0; k < i; k++) {
				list.add(". ");
			}
		}
//8-----------------------------------------------

		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (i == name.length() / 2) {
					list.add(String.valueOf(A[j]) + " ");
				} else {
					list.add(". ");
				}
			}
		}

//-----------------------------------------------

		return list;
	}

}
