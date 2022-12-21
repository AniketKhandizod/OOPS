package logical_Programming_BySDET;

public class Arrays_MissingNumber {
	//Arrays should not have duplicate 
	//sorted order
	//in range

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9,10};int store=0,bung=0;
		
		for (int i=0;i<a.length;i++) {
			store = store +a[i];
		}
		for (int i=0;i<=10;i++) {
			bung=bung+i;
			
		}
		System.out.println("missing number = "+(bung-store) );
		System.out.println(bung);
		System.out.println(store);
		
	}

}
