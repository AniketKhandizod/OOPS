package classProgramming;
import java.util.Scanner;
public class IF_Statement {

	public static void main(String[] args) {
		while (true){
		int age =20;
		Scanner Scan = new Scanner (System.in);
		System.out.println("");
		System.out.println("Put any number");
		int Number = Scan .nextInt();
		
		if (age > Number) {
			System.out.println("Age is more than given number");
			              } 
		if (age < Number) {
			System.out.println("Age is less than given number");
		}

		else {
			System.out.println("your inpute is euqla to age");
			break;
			}
			 }
		}
		
	}

		  
		 		
	


