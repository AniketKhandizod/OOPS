package logical_Programming_BySDET;

public class String_Word_reverse {
	
	public static void M1() {

		String S = "Welcome to java";        System.out.println("Original = "+S);
		String [] words = S.split(" ");
		String REF = "";
		
		for (String W : words) {
			String REV ="";
			for (int i=W.length()-1;i>=0;i--) {
				REV =REV +W.charAt(i);
			}
			REF = REF + REV +" ";
		}
		System.out.println("Reversed = "+REF);
	}
	public static void M2() {
		String S = "Welcome to java";        System.out.println("Original = "+S);
		String [] words = S.split("\\s");
        String REF = "";
		
		for (String W : words) {
			StringBuilder SB = new StringBuilder (W);
			SB.reverse();
			
			REF = REF+SB.toString()+" ";			
		}
		System.out.println("Reversed = "+REF);
	}

	public static void main(String[] args) {

		//M1();
		M2();
		
	}

}
