package classProgramming;

public class While_Loop {
	static int i=0;
	public static void Method() {
		int a[] = {10,20,30,40,50,60,70,80,90,100,101,102,103,104,105,106,107,108};
		/*System.out.println(a[7]);
		System.out.println(a.length);*/
		
		
		if (a.length==20) {
			while (true) {
				System.out.println(a[i]);
				i++; continue;
			    }
		}
		if (a.length==19) {
			do {				
			  	System.out.println("A");
			   }
			  	while(i<=18);
			
		}
		
		else {
			for (int j = 0;j<=17;j++) {
				System.out.print(" ");
				for (int k = 17;k>=0;k--) {
					System.out.print(" "+a[k]);
				}
				System.out.println(" ");
			    }
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		Method();
	}

}
