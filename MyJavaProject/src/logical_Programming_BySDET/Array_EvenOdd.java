package logical_Programming_BySDET;

public class Array_EvenOdd {

	public static void main(String[] args) {

		long Array[]= {1,2,3,4,5,6,7,8,19,10,11,12,13,14,15,16,17,18,19,20};
		long SumE=0,SumO=0;
		
		System.out.print("Even number = ");
		for (int i = 0; i<Array.length;i++) {
			
			 if (Array[i] % 2== 0) {System.out.print( Array[i]+" " );SumE = SumE + Array[i] ;}
			 
			 
		}
		System.out.print(" Addition = "+SumE);
		System.out.println();
		
		System.out.print("Odd  number = ");
		for (int i = 0; i<Array.length;i++) {
			
			 if (Array[i] % 2!= 0) {System.out.print(Array[i]+" ");SumO = SumO + Array[i] ;}
			 
		}System.out.print(" Addition = "+SumO);		
	}
}
