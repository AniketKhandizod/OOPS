package Polymorphism;

public class AutomaticPromotion {
	
	void M1(int a) {System.out.println(a);}	
	void M2(double a) {System.out.println(a);}
	void M3(float a) {System.out.println(a);}
	void M4(long a) {System.out.println(a);}
	long M4(long... a) {long sum = 0;
         for (long i : a) {
			sum = sum + i;
		}
         return sum;
	}
		
	
	
	public static void main(String[] args) {
		AutomaticPromotion A = new AutomaticPromotion();
		A.M1('A');
		A.M2(5555L);
		A.M3(9999L);
		A.M4((int)5.5);
		long B = A.M4(6464,44,684,64);System.out.println(B);
		
		

	}

}
