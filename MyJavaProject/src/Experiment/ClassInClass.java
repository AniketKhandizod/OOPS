package Experiment;
class outer2{
	static class inner2{
		void M2() {
			System.out.println("Static");
		}
	}
}
class outer{
	class inner{
		void M1() {
			System.out.println("Non-Static");
		}
	}
}

public class ClassInClass {

	public static void main(String[] args) {

		outer OBJ = new outer();
		outer.inner OBJ1 = OBJ.new inner();
		OBJ1.M1();
		
		//outer OBJ2 = new outer();
		outer2.inner2 OBJ3 = new outer2.inner2();
		OBJ3.M2();
		
		
	}

}
