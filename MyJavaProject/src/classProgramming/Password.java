package classProgramming;
import java.util.Scanner;  // i imported utlity scanner class
public class Password {

	public static void main(String[] args) {
		
		// F = 555;
		//int D = 555;
		
		Scanner SC = new Scanner (System.in);    // i created object here
		
		System.out.println("What is your User_name : ");    // i written printing statement to notify user about input
		String User_name = SC.next().trim();	                    // 	i created here scanner method to get username
		
		System.out.println("What is your Password : ");    // i written printing statement to notify user about input
		String Password = SC.next().trim();                        // 	i created here scanner method to get password
		
		
		
		if ((User_name.equals("XYZ")) && (Password.equals("XYZ"))) {
			System.out.println("You login succesfully");
		}
		
		else {
			System.out.println("Fail to login");
		}
		
	}
}
//value we can compare
//String is object type 