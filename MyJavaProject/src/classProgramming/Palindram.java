package classProgramming;
import java.util.Scanner;
public class Palindram {

	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		System.out.println("Inpute = ");
		long Store = S.nextLong();
		
		long SS = Store;
		long Rev = 0;
				
		while (SS!=0) {
			Rev = Rev * 10 + (SS%10);
			SS/=10;				
		}
		//System.out.println(Rev);
		
		if (Store == Rev) {System.out.println("Number is Plaindrom");}
		else {System.out.println("No Prime");}
		
				
	}
	

}
