package Experiment;


abstract class AbstractM {
	static int B =10;
	
	static  {
		 int a =10;
		 
	}
	
	abstract public  void m1();
	public static Object M2(AbstractM hh) {
		System.out.println(hh.B);
		return hh.B=20;
		
	}

	public static void main(String[] args) {
		Object A = M2(null);
		System.out.println(A);
	}

}
