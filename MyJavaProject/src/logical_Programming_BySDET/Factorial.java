package logical_Programming_BySDET;

public class Factorial {

	public static void main(String[] args) {

		for (int j = 1;j<20;j++) {
		    long FAC = 1;
		    for (int i=1;i<=j;i++) {
			    FAC = FAC * i;
			    
		        }System.out.println("For "+j+" Factorial is = "+FAC);}
	}

}
