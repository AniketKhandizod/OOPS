package logical_Programming_BySDET;
public class String_Reverse {	
	
	public static void M1() {  //by Concatneting operator
		 String STR = "ABCD";
		 String REV = "";
		
		int Lenght = STR.length(); //this will print 4 it will not start count from zero	
	    for (int i = Lenght - 1 ; i>=0 ; i--) {	    	
	    	REV=REV+STR.charAt(i);	    	
	    }
	    System.out.println(REV);
	}

	public static void M2() {   //using charachter array
		String STR = "ABCD";
		String REV = "";
		
		char a[] = STR.toCharArray();
		int Lenght = a.length;
		for (int i=Lenght-1;i>=0;i--) {
		REV = REV + a[i];	    
		}
		System.out.println(REV);
	}
	
	public static void M3() {       //using String buffer class
		
		String STR = "ABCD";
		StringBuffer SB = new StringBuffer(STR);
		System.out.println(SB.reverse());
		
	}
	
	public static void main(String[] args) {

		M1();
		M2();
		M3();
	
	
	}

}
