package UDEMY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Collectionsss {

	public static void M1() {
		ArrayList<List<String>> l = new ArrayList<List<String>>();
		l.add(Arrays.asList("A", "B", "C"));

		List<String> A = l.get(0);
		System.out.println(A);
		System.out.println(A.contains("B"));

	}

	public static void M2() {

		HashSet<String> h = new HashSet<String>();
		h.add("A");
		h.add("B");
		h.add("D");
		h.add("C");
		h.add("E");
		h.add("F");
		System.out.println(h);
		List<Object> A = Arrays.asList(h.toArray());
		System.out.println(A);

	}

	public static void main(String[] args) {

		M1();
		M2();
	}

}
