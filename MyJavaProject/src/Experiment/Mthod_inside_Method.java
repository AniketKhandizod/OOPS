package Experiment;

public class Mthod_inside_Method {
	
	public  void M1(int A) {

		System.out.println("A");
		M1(A-2);
	}
	public static void main(String[] args) {

		Mthod_inside_Method A = new Mthod_inside_Method();
		A.M1(5);
		
		
	}

}
