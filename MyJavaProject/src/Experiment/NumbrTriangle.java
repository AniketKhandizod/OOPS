package Experiment;

public class NumbrTriangle {

	public static void main(String[] args) {

		int V = 9;
		for (int i = 1; i <= V; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}System.out.println();			
		}
		for (int i = 1; i <= V; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}System.out.println();
	}System.out.println();
		for (int i = 1; i <= V; i++) {
			for (int j = V; j >= i; j--) {
				System.out.print(j);
			}System.out.println();
	}
		for (int i = 1; i <= V; i++) {
			for (int j = i; j <= V; j++) {
				System.out.print(j);
			}System.out.println();
	}


}}
