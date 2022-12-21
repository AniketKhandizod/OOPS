package classProgramming;

public class This {
	 int A ;    // we only declare it here class varible
	 double B;
	
	This(int A , double B){ //we created here one argument constructor
	  this. A=A;
	  this. B=B;
	   
	}
	public void nonstatic () {
		System.out.println(A);
		System.out.println(B);	
	}
	
	

	public static void main(String[] args) {
		This D = new This (55,55);    // object created for contructor
        D.nonstatic();                // we called  here non static method
	}

}
