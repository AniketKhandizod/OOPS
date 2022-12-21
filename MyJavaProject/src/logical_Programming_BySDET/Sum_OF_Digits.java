package logical_Programming_BySDET;
import java.util.Scanner;
public class Sum_OF_Digits {

	public static void main(String[] args) {

		Scanner SC = new Scanner (System.in);
		System.out.print("Give inpute for adding all numbers = ");
		long num = SC.nextLong();
		
		long REF = 0;
		long Store;  //19 digit u can store in long
		
		while (num != 0) {
			
			Store = num%10;
			REF = REF + Store;
			num/=10;
		}System.out.println(REF);
	}

}
