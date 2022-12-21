package classProgramming;

class PParetn{
	String name = "Parent_String";
	static void M1() {
		System.out.println("Parent");
	}
}
class child22 extends PParetn  {
	String name = "Child22_String";
	static void M1() {
		System.out.println("Child22");
	}
}
class child33 extends child22  {
	String name = "Child33_String";
	static void M1() {
		System.out.println("Child33");
	}
}
class child44 extends child33  {
	String name = "Child44_String";
	static void M1() {
		System.out.println("Child44");
	}
}

public class Upcasting {

	public static void main(String[] args) {

		/*PParetn A = new child22();
	    A.M1();
	    System.out.println(A.name);
	    
	    child22 B = new child22();
	    B.M1();
	    System.out.println(B.name);*/
	    
		PParetn C = new child44();   // upcasting
		child44 D = (child44) C ;     // Downcasting
		
		
	    D.M1();
	    System.out.println(D.name);
	    
	    
	    
		
	}

}
