package classProgramming;

class parent {
	public  void M1() {
		System.out.println("Hello i am Parent");

	}
}
class child extends parent {
	
	public  void M1() {
		this.M1();
		System.out.println("Hello im Child");
	}
}
class Sub_Child extends child {
	public  void M1() {
		super.M1();
		System.out.println("Hello im Sub-Child");
	}
}

public class Overrrding extends Sub_Child {

	public static void main(String[] args) {

		Overrrding OBJ = new Overrrding();
		OBJ.M1();
		
		
	}

}
