package logical_Programming_BySDET;
//prime number -- must be greter than one , and which have two factors one and itself
//eg - 2 3 5 7 11 13 17 19

public class Prime_Number {

	public static void main(String[] args) {

		for (int j = 0;j<=100000;j++) {int count =0;		
		
		if (j>1) {			
			for (int i = 1 ; i<=j ;i++) {if (j%i==0) count++;}								
			
			if (count == 2)System.out.println("prime number = " + j);}			
			}
		
	}

}
