package logical_Programming_BySDET;

public class Array_Max_Min {
	int A[] = {10,30,20,50,30,40,200,1255,5,9,654,6546,64,451,54,7,84,654,561,5,654,654,654,651,6519684,984654,65,546,45};
	int REF = A[0];
	
	void MAX() {
		for (int i = 0;i<A.length;i++) {
			
			if (A[i]>REF) {
				REF=A[i];
			}				
			}
		System.out.println("Max is = "+REF);
	}
	void MIN() {
         for (int i = 0;i<A.length;i++) {
			
			if (A[i]<REF) {
				REF=A[i];
			}				
			}
		System.out.println("Min is = "+REF);
	}

	public static void main(String[] args) {

		Array_Max_Min ASD = new Array_Max_Min();
		ASD.MAX();
		ASD.MIN();
		
		
		
		}
		
	}

