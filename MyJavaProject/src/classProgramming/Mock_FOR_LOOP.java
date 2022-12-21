package classProgramming;

public class Mock_FOR_LOOP {

	public static void main(String[] args)  {

		for (int i = 1; i <= 5; i++) { // number of row
			
			for (int j = 5; j >= i; j--) {  // number of column
				
				System.out.print(" *");

			}System.out.println();
		}

	}

}
//rows =5  column =5