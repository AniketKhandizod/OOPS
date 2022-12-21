package Experiment;

public class while_loop {

	public static void main(String[] args) {		
        int k =0;
		int i=10;
		int a[]=new int[500];  // why this showing too mutch output
		
		while (i != 0) {System.out.println("K = "+k);
			 a[k]=i;
			i--;k++;
			
			
			
		}System.out.println("While  loop is over");
		
		
		for (int n :a) {
			//System.out.print(" i = "+ n);
		}
		System.out.println(a.length);
		
		
		
		/*int j=10;
		do {
			System.out.println(j);
			j--;
		}while(j != 1); */
	
	
	
	
	
	}
	
	
	

}
