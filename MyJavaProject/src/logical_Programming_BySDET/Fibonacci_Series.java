package logical_Programming_BySDET;

public class Fibonacci_Series {
	

	public static void main(String[] args) {
        
		long j = 0,k=1 ,sum = 0;
		long a[] = new long [500];
		for (int i=0;i<=90;i++) {
			
			sum = j+k;
			a[i] = sum;
			j=k;
			k=sum;	
		
	}
		for (int i=0;i<=90;i++) {
			System.out.println(i+" = "+a[i]);
		}
	}
}
