package Experiment; //overriding

class A11 {

	public static void main(String[] args) {
		System.out.println("1");
	}
}

class A12 extends A11 {

	public static void main(String[] args) {
		System.out.println("2");
	}
}

class A13 extends A12 {

	public static void main(String[] args) {
		System.out.println("3");
	}
}

public class MainOverriding extends A13 {

	public static void main(String[] args) {
		System.out.println("4");
	}

}
