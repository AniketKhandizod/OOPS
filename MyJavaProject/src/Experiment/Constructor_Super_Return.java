package Experiment;
import java.util.Scanner;
interface Interface {String Method_01();}

class Class implements Interface  {
	
	Class(int T){
		// Constructor of parent class
	}
	public  String Method_01() {		
		Scanner SC = new Scanner (System.in);
		String A = SC.next();	
		return A;                        // Returning A value from here
	}
}
class Class_1 extends Class {
  Class_1(int T) {
		super(99);
		// Constructor of child class with super keyword
	}

       // static String ZZ; 
	
	public String  Method_01() {
		
		System.out.println("Input username : ");
		String ZZ = super.Method_01();        //Getting value of A here
		//this.ZZ=ZZ;                         //Assigning local to global variable
		return ZZ;                            // Returning Z from here
		
	}
}
class Class_2 extends Class_1{

	Class_2(int T) {   // Constructor of parent class with super keyword for integer
		super(99);
	}
	Class_2(String S) {   // Constructor of parent class with super keyword for String
		super(99);
	}
	
}
public class Constructor_Super_Return extends Class_2  {	
	
	Constructor_Super_Return(int T){
		super( 99);
	}
	
	Constructor_Super_Return( String S) {		
		super( "Class");                     // Exicuted 1st
	}

	public static void main(String[] args) {	
		Constructor_Super_Return FG = new Constructor_Super_Return("Main");
		String a = FG.Method_01();                 //Calling method with getting return value of ZZ
		new Class_2("sperate in main");    // Exicuted 2nd
		if (a.equals("XYZ")) {

			Class_2 AE = new Class_2("IF");   // Exicuted 3rd
			System.out.println(a);
		}else {System.out.println("Something went wrong");}
	}

}
