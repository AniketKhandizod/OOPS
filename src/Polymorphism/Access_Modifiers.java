package Polymorphism;

class Test {
	private void M1() {System.out.println("Parent");}
	
	void M2() {System.out.println("Parent");}
//	private  void M2() {System.out.println("Parent");}
	
	private  void M3() {System.out.println("Parent");}
//  void M3() {System.out.println("Parent");}
//	protected  void M3() {System.out.println("Parent");}
	
	private  void M4() {System.out.println("Parent");}
//  void M4() {System.out.println("Parent");}
//  protected  void M4() {System.out.println("Parent");}
//	public  void M4() {System.out.println("Parent");}
	
  
}

public class Access_Modifiers extends Test {
	
	private void M1() {System.out.println("Child");}
    void M2() {System.out.println("Child");}
	protected  void M3() {System.out.println("Child");}
	public  void M4() {System.out.println("Child");}

	public static void main(String[] args) {

		Access_Modifiers A = new Access_Modifiers();
		A.M1();
		
		
		
	}

}
