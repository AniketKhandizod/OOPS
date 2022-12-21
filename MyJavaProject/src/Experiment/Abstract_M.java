package Experiment;
abstract class one {	
	private void A_ME_1() {System.out.println("Absract_ME_1");}
	private void A_ME_1a() {System.out.println("Absract_ME_1a");}
	
	public static void A_ME_2(int a)  {System.out.println("Absract_ME_2 "+a);}
	public void A_ME_3() {System.out.println("Absract_ME_3");}
	void A_ME_4() {System.out.println("Absract_ME_4");}	
	
}
abstract class one_1 {	
	private void A_ME_1() {System.out.println("Absract_ME_1");}
	private void A_ME_1a() {System.out.println("Absract_ME_1a");}
	
	public static void A_ME_2() {System.out.println("Absract_ME_2");}
	public void A_ME_3() {System.out.println("Absract_ME_3");}
	void A_ME_4() {System.out.println("Absract_ME_4");}	
}
interface two {
	private void I1_ME_1(String S) {System.out.println("Interface_ME_1");}
	private void I1_ME_1a() {System.out.println("Interface_ME_1a");}
	
	public static void I1_ME_2() {System.out.println("Interface_ME_2");}
	//public void I1_ME_3() {System.out.println("Interface_ME_3");}   //not able to write like this
	//void I1_ME_4() {System.out.println("Interface_ME_4");}   //not able to write like this
}
interface two_1 extends two {
	private void I2_ME_1(int a) {System.out.println("Interface_ME_1");}
	private void I2_ME_1a() {System.out.println("Interface_ME_1a");}
	
	public static void I2_ME_2() {System.out.println("Interface_ME_2");}
	//public void I2_ME_3() {System.out.println("Interface_ME_3");}   //not able to write like this
	//void I2_ME_4() {System.out.println("Interface_ME_4");}   //not able to write like this
}
class three{
	private void C_ME_1() {System.out.println("Class_ME_1");}
	private void C_ME_1a() {System.out.println("Class_ME_1a");}
	
	public static void C_ME_2() {System.out.println("Class_ME_2");}
	public void C_ME_3() {System.out.println("Class_ME_3");}
	void C_ME_4() {System.out.println("Class_ME_4");}	
	
}
class three_1{
	private void C_ME_1() {System.out.println("Class_ME_1");}
	private void C_ME_1a() {System.out.println("Class_ME_1a");}
	
	public static void C_ME_2() {System.out.println("Class_ME_2");}
	public void C_ME_3() {System.out.println("Class_ME_3");}
	void C_ME_4() {System.out.println("Class_ME_4");}	
}

/*class four extends one_1 ,one {}
class four_1 extends two_1 two {}
class four_3 implements one three {}
class four_2 implements two_1 ,two {}*/
	

final class Abstract_M  extends one  implements two_1   {  // u need to first define extend then implement

	private void I2_ME_1() {
		System.out.println("hello ");
	}
	
	public static void main(String[] args) {
        
		Abstract_M A = new Abstract_M();
		A.A_ME_3();
		A.A_ME_4();
		A.A_ME_2(65);
		A.I2_ME_1();
		
		
		
				
	}

}
