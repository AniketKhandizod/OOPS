package classProgramming;

public class MMOCK {

	public static void main(String[] args) {

	long Store = 123456L,Z,A = Store,count =0,S=0,SS=0;
	
	while (A!=0) {A /=10; count++;}   // this only for count digit 
	
	
		for (int i = 1; i <= count ; i++) {
			
			Z = Store%10;
			S=S*10+Z;
			
			
			
			Store  = Store / 10;
		}
		
		System.out.print("Ulti sankhya = "+S);
		System.out.println();
		while (S!=0) {
			SS=SS*10+S%10;			
			S/=10;
		}
		System.out.print("Soychi sankhy = "+SS);
	}

}
