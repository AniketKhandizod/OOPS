package logical_Programming_BySDET;
import java.util.Scanner;

class Parent_1{
	private static  int NUM;
	
	int M1 () {
		Scanner SC = new Scanner(System.in);
		System.out.println("Give input for check even odd = ");
		int Number = SC.nextInt();
		return this.NUM=Number;
	}	
	int M2() {
		int A = NUM;
		return A;
	}
}

public class Even_odd extends Parent_1 {
	
	boolean M3 () {System.out.println("This statment Form Child M1 before super");
		super.M1();
		System.out.println("This statment Form Child M1 after super");
		int A =10;
		Parent_1 AS = new Parent_1();
		int INPUT = AS.M2();
		
		if (INPUT %2 == 0) {return true;}
		else {return false;}	   
	}	
	public static void main(String[] args) {

		Even_odd OBJ =new Even_odd();
		System.out.println("Number is even  = "+OBJ.M3()); 
        
	}

}
