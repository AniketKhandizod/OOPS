package Experiment;

class Demo{
	static {
		System.out.println("hello form classs Demo and static_1");
		int A =55;
		System.out.println(A);
	}
	static {
		System.out.println("hello form classs Demo and static_2");
		
	}
	void wish() {
		System.out.println("hello form wish method");
	}
	
}

public class Class_Call {

	public static void main(String[] args)throws Exception  {

		Demo D = new Demo();
		D.wish();
		
		
	}

}
