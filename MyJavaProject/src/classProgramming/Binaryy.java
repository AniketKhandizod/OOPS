package classProgramming;

public class Binaryy {

	public static void main(String[] args) {

		int A = 159,S=A;
		int a[] = new int [10];
		for (int i = 0; S !=0 ; i++) {
			//S=S%10;
			a[i] =(S%2);
			S/=10;
		}
		for (int F : a) {
			System.out.println(F);
		}
	}

}
