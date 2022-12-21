package Experiment;

class ASDS {
	int a = 8;
	static int b = 9;

	ASDS() {
		System.out.println("top Parent");
	}
}

class ASDF extends ASDS {
	int a = 10;
	static int b = 11;

	ASDF() {
		System.out.println("Child 1");
	}
}

public class Constrrructor extends ASDF {
	int a = 12;
	static int b = 13;

	Constrrructor() {
		System.out.println("Child 2");
		//System.out.println(ASDS.a);    not possible
		ASDS A = new ASDS();
		System.out.println(A.a);
		System.out.println(ASDS.b);
		System.out.println("Super = "+super.a);
		System.out.println("Super = "+super.b);
		System.out.println("This = "+this.a);
		System.out.println("This = "+this.b);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		Constrrructor A = new Constrrructor();

	}
	
	/*Constrrructor(int a){
		if (a>0) {
			new Constrrructor(a-1);
			System.out.println(a);}
			*/
		
	}


