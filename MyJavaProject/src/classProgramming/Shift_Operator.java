package classProgramming;

public class Shift_Operator {

	public static void main(String[] args) {
		
		int R = 1;
		int F = 2;
		int G = 3;
		for (int i = 0;i<=32;i++)
		{
		System.out.print("when R<<"+i+" = ");
		System.out.println(R<<i);
		}
        System.out.print("Logical && with first statement pass second statement pass = ");
		System.out.println( R<F  && F<G);                                                 //if ur first logic fail then it not proceed to 2nd conditon and shows false
		System.out.print("Logical && with first statement pass second statement fail = ");
		System.out.println( R<F  && F>G);
		System.out.print("Logical && with first statement fail second statement fail = ");
		System.out.println( R>F  && F>G);
		
	    System.out.print("bitwise & with first statement pass second statement pass = ");
	    System.out.println( R<F  & F<G);  
	   	System.out.print("bitwise & with first statement pass second statement fail = ");
		System.out.println( R<F  & F>G);
		System.out.print("bitwise & with first statement fail second statement fail = ");
		System.out.println( R>F  & F>G);
		
	    System.out.print("Logical || with first statement pass second statement pass = ");
	    System.out.println( R<F  || F<G); 
	   	System.out.print("Logical || with first statement pass second statement fail = ");
		System.out.println( R<F  || F>G);
		System.out.print("Logical || with first statement fail second statement fail = ");
		System.out.println( R>F  || F>G);
		
	    System.out.print("bitwise | with first statement pass second statement pass = ");
	    System.out.println( R<F  | F<G);  
	   	System.out.print("bitwise | with first statement pass second statement fail = ");
		System.out.println( R<F  | F>G);
		System.out.print("bitwise | with first statement fail second statement fail = ");
		System.out.println( R>F  | F>G);
	}

}
