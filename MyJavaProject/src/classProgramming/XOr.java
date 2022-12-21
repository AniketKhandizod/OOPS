package classProgramming;
import java.util.Scanner;
public class XOr {	
	public static void main(String[] args) {		
		Scanner A = new Scanner (System.in);
		System.out.println("Put First value");
		int B = A .nextInt();
		System.out.println("Put Second  value");
		int D = A .nextInt();
		
		int a = B;
		int b = D;
		System.out.println("Bitwise exclusive is = " + (a^b));
	}
}
