package Experiment;

public class Return_to_another_method {
	
	public int  m1(int A , int B) {
		return (A+B);
	}
	
	public void m2 () {
		int A = m1(1,1);
		System.out.println("output From Method_2 = "+A);
		System.out.println("output From Method_2 = "+m1(2,2));
	}

	public static void main(String[] args) {

		Return_to_another_method D = new Return_to_another_method();
		int M1 = D.m1(3, 3);
		D.m2();
		System.out.println("Output from main method = "+M1);
		System.out.println("Output from main method = "+D.m1(4, 4));
		
	}

}
