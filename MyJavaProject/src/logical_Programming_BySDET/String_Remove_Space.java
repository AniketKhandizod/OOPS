package logical_Programming_BySDET;

public class String_Remove_Space {

	public static void main(String[] args) {

		String S = "He    ll      o";
		
		System.out.println("Before Space Remove : "+S);
		
		S=S.replaceAll("\\s", "");
		
		System.out.println("After  Space Remove : "+S);
	}

}
