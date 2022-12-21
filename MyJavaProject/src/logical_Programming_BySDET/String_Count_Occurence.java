package logical_Programming_BySDET;

public class String_Count_Occurence {

	public static void main(String[] args) {

		String S = "Java programming Java oops";
		String replace = "a";
		int Tcohnt = S.length();
		int Fcount = S.replace(replace, "").length();
		
		int count = Tcohnt-Fcount;
		System.out.println("Number of occurence of '"+replace+"' is :"+count);
		
		
		
	}

}
