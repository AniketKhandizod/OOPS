package Polymorphism;

class ADD{
	Object show() {return "O";}
	Number show1() {return 66;}
}

public class Return_tyoe extends ADD {
	
	String show() {return "S";}
	Integer show1() {return 55;}
	

	public static void main(String[] args) {
    
		Return_tyoe SD = new  Return_tyoe ();
		System.out.println(SD.show());
		System.out.println(SD.show1());
	}

}
