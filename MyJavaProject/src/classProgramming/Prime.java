package classProgramming;

public class Prime {

	public static void main(String[] args) {

		int count = 0;
		
		for(long i=1;i<=1000000000000000000L;i++) {
			for(long j=1;j<=i;j++) {
				if (i%j==0) {count ++;}  
			}
			if (count == 2) {System.out.println(i);count = 0;}
			count = 0;
		}
	}

}
