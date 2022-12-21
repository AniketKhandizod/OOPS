package Experiment;

public class Constructor_Call_02 extends Constructor_Call_01 {

	
	Constructor_Call_02 (){
		System.out.println("Default Child");
	}
	Constructor_Call_02(int a){
		System.out.println(a+a);
	}
	public static void main(String[] args) {

		//Constructor_Call_01 A = new Constructor_Call_01(11);
		//Constructor_Call_01 B = new Constructor_Call_01();		
		Constructor_Call_02 D = new Constructor_Call_02();
		//Constructor_Call_01 E = new Constructor_Call_02(12);
		
		
	}

}
