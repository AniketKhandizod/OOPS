package classProgramming;

class Parent_0123 {                                                  //class 1
	public static void M_01() {
		System.out.println("HEllo from parent class");
	}
}
class Child_002  extends Parent_0123   {                                                  //class 1
	public static void M_02() {
		System.out.println("HEllo from parent class");
	}
}
class child_001 extends Parent_0123  {                                    // Child class 2
	public static void M_03() {
		System.out.println("HEllo from Child small letter class");
}
}

public class Demo_10 extends Parent_0123    {                 // Child class 3

	public  static void  main( String [] ar) {
	
		Demo_10 OBJ = new Demo_10();
	    OBJ.M_01();
	   // OBJ.M_02();
	   // OBJ.M_03();
	    child_001 OBJ_1 = new child_001();
	    OBJ_1.M_03() ;
	}
}