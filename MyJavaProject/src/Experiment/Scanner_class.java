package Experiment;
import java.util.Scanner;

interface INT {
	void pprint(String A);
	public static void Even() {}
	}

class SC1 implements INT {
	public void pprint(String A) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Put input: ");
		int Z = SC.nextInt();
		System.out.println(A + Z);
	}
	public static void Even() {

		Scanner SC = new Scanner(System.in);
		System.out.println("Put input: ");
		int Z = SC.nextInt();
		if (Z%2==0) {
			System.out.println("Even number");
		}else { System.out.println("Odd number");}
	}
}
public class Scanner_class extends SC1 {

	public static void main(String[] args) {
		
		Scanner_class AE = new Scanner_class();
		AE.pprint("Out put : ");
		Even();
		}
}
