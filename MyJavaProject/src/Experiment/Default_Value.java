package Experiment;

public class Default_Value {
	 double B;
	 static double A;
	 String name;
	 int C;
	 boolean D;
	
	Default_Value(double B,double A,int C,String name,boolean D){
		B=B;
		A=A;
		name=name;
		C=C;
		D=D;
	}
	 void AB() {
		  System.out.println(A);
		  System.out.println(B);
		  System.out.println(C);
		  System.out.println(name);
		  System.out.println(D);
	}

	public static void main(String[] args) {
		
		Default_Value G = new Default_Value(44.55,555.22,55,"Aniket",true);
		G.AB();
		}
	    

}
