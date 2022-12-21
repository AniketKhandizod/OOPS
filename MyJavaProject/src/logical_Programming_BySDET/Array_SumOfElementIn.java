package logical_Programming_BySDET;

public class Array_SumOfElementIn {

	public static void main(String[] args) {

		long Array[] = {10,20,30,40,50,60,70,80,90,100};
		int lenght = Array.length;
		long sum = 0;
		
		for (int i = 0;i<lenght ;i++) {
		    sum = sum+Array[i];
		   
		}
		System.out.println("Lenght of array is = "+lenght+" Sum of array is = "+sum);
		
		long sum1 = 0;
		for (long Val : Array) {   //inhanced for loop
			sum1=sum1+Val;			
		}
		System.out.println("Answer by inhanced for loop = "+sum1);
	}

}
