package Polymorphism;
class Test1{
	
	int A = 10;
	static int B = 11;
	String C = "Parent";
	static void M1() {System.out.println("Parent");}
    void M2() {System.out.println("Parent");}
}

public class Static_nonSattic_01 extends Test1 {
	
	  int A = 12;
	  static int B = 13;
	  String C = "Child";
	  static void M1() {System.out.println("Child");}
      void M2() {System.out.println("Child");}
	

	public static void main(String[] args) {

		Test1 B = new Static_nonSattic_01 ();
		System.out.println(B.A); //10
		System.out.println(B.B); //11
		System.out.println(B.C); //Parent
		B.M1();                  //Parent
		B.M2();                  //Child
		
		Static_nonSattic_01 A = new Static_nonSattic_01 ();
		System.out.println(A.A); //12
		System.out.println(A.B); //13
		System.out.println(A.C); //Child
		A.M1();                  //Child
		A.M2();                  //Child
		
	}

}
