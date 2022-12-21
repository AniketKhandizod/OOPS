package Logical_Program_Venkat;
import java.util.Scanner;
public class Factorial {

	static int  FREEZ ; 
	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		System.out.print("Give limit = ");
		int Limit = SC.nextInt();
		int Store = 1;
		FREEZ = Limit;
		
		System.out.print(Limit + "! = ");
		while (Limit >= 0) {
			System.out.print(Limit );
			if (Limit != 0) {
			System.out.print(" * ");}

			if (Limit != 0) {
				Store = Limit * Store;
			}

			Limit--;

		}
		System.out.println();
		System.out.println(FREEZ+"! = " + Store);
	}

}
