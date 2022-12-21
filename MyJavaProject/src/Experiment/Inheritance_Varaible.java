package Experiment;
class c1{
	static final  int A = 10;
	
	static int  demo () {
		System.out.println(A);
				return A;
	}
	
	static void demoo() {
		demo ();
		
		System.out.println("Yoo! ");
	}
	
	public static void main(String[] args) {
		System.out.println("hello from Main");
		demoo() ;
	}
	int c1()
	
{     int a;
		return a=10;
		}
}

public class Inheritance_Varaible extends c1 {
	public static void m1() {System.out.println("M1");}

	public static void main(String[] args) {

		c1 AS = new c1();
		AS.main(args);
		System.out.println(AS.demo() + 55);
		//AS.A=55;
		 
		c1 A = new Inheritance_Varaible();
		
		Inheritance_Varaible V = (Inheritance_Varaible)A;
		V.m1();
	}

}
