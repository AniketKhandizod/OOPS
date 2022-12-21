package Polymorphism;
class A1{
	static void M1() {System.out.println("Parent");}
    void M2() {System.out.println("Parent");}
}
class A2 extends A1{
	static void M1() {System.out.println("child 1");}
    void M2() {System.out.println("child 1");}
}
class A3 extends A2{
	static void M1() {System.out.println("child 2");}
    void M2() {System.out.println("child 2");}
}
public class Static_nonSattic_02 extends A3 {

	static void M1() {System.out.println("child 3");}
    void M2() {System.out.println("child 3");}
    
	public static void main(String[] args) {

		A1 A = new  Static_nonSattic_02();A.M1();A.M2();                // Parend & child 3		
		A2 B = new  Static_nonSattic_02();B.M1();B.M2();                // child 1 & child 3		
		A3 C = new  Static_nonSattic_02();C.M1();C.M2();                // child 2 & child 3		
		Static_nonSattic_02 D = new Static_nonSattic_02();D.M1();D.M2();// child 3 & child 3
		M1();                                                           // child 3
	}

}
