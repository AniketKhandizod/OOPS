package Patterns;
public class Leaf_Three {
	static int i, j, k, l = 10;

	public static void main(String[] args) {

		for (i = 1; i <= 10; i++) {
			for (j = 50; j >= (i * 2); j--) {
				System.out.print(" ");
				l++;
			}
			for (k = 3; k <= i * 4; k += 2) {
				System.out.print("3 ");
			}
			System.out.println();
		}
		for (i = 1; i <= 10; i++) {
			for (j = 30; j >= (i * 2); j--) {
				System.out.print(" ");
			}
			for (k = 3; k <= i * 4; k += 2) {
				System.out.print("1 ");
			}
			for (k = 5; k <= 25 - (i * 2); k++) {
				if (k == 5 || k == 25 - (i * 2)) {
					System.out.print("  ");
				} else {
					System.out.print("3 ");
				}
			}
			for (k = 3; k <= i * 4; k += 2) {
				System.out.print("2 ");
			}
			System.out.println();
		}
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= ((i + 4) * 2); j++) {
				System.out.print(" ");
			}
			for (k = 5; k <= 24 - (i * 2); k++) {
				if (k == 5)
					System.out.print("  ");
				else
					System.out.print(" 1");
			}
			for (k = 3; k <= i * 4; k += 2) {
				if (k == 3) {
					System.out.print(" ");
				} else {
					System.out.print("  ");
				}
			}
			for (k = 5; k <= 24 - (i * 2); k++) {
				if (k == 5)
					System.out.print("      ");
				else
					System.out.print("2 ");

			}

			System.out.println();
		}
	}

}
