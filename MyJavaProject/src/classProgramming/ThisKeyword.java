package classProgramming;

public class ThisKeyword {
	
	int A ;
	String name;
	char B;
	
	ThisKeyword(int A, String name , char B)
	{
	  this.A=A;                           // we use this at the time of naming conflict 
	  this.name= name;                   // this use to represent global variable at the time of name conflic
	  this.B=B;
	}
	public void nonStatic() {
		System.out.println(A);
		System.out.println(name);
		System.out.println(B);
	}

	public static void main(String[] args) {
		ThisKeyword C = new ThisKeyword(55,"Mad",'H');
		ThisKeyword D = new ThisKeyword(66,"Bad",'G');
		C.nonStatic();
		D.nonStatic();
		
	}

}
