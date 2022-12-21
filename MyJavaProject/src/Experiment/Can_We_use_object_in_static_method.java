package Experiment;

public class Can_We_use_object_in_static_method {
 
	public static void meth() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Can_We_use_object_in_static_method A = new Can_We_use_object_in_static_method();
		A.meth();
	}

}
