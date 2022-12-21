package Experiment;

public class Return_to_another_method_2 {
	
	boolean M1 (String S) {
		return (S.equalsIgnoreCase("XXXX"));
	}
	String M2 () {
		String J = "xxXx";
		String K = "xXxx";
		String L = "Xxxx";
		
		if (M1(J)&&true) {System.out.print("If for J = ");return("Success...for J");}
   else if (M1(K)&&true) {System.out.print("If for K = ");return("Success...for K");}    
   else	if (M1(L)&&true) {System.out.print("If for L = ");return("Success...for L");}
		else{return("Fail....");}
		
	}
	String M3 () {
		String J = "xxxX";
		String K = "xxXx";
		String L = "Xxxx";
		
		if (M1(J)&&M1(K)&&M1(L))  {System.out.print("If for J K L =   ");return("Success...for JKL");}   
		else{return("Fail....");}
		
	}

	public static void main(String[] args) {
		
		Return_to_another_method_2 F = new Return_to_another_method_2 ();
		
		System.out.println(F.M2());
		System.out.println(F.M3());
		
		

	}

}
