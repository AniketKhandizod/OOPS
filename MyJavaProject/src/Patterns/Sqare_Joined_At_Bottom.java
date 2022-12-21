package Patterns;
import java.util.Scanner;
public class Sqare_Joined_At_Bottom {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("Put any even value : ");
		int A = SC.nextInt();
		
		
		for (int i = 1;i<=A;i++) {
			for (int j = 1 ; j<= A ; j++) {
				if (i==1||i==A||i==(A/2)||j==1||j==A) {
					System.out.print("*");
				}
				else System.out.print(" ");
				
			}System.out.println();
		}SC.close();
	}

}
