package logical_Programming_BySDET;

public class String_Remove_junk {

	public static void main(String[] args) {

		String s= "This#string%contains^special*characters&.";
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		
		String A= "A&*&((*(*(&*&(*^&%&^^$%$#%$N()()*&*&*&^*&*IhjbhbblhbhhbhblhjK511615165561E}{{}}{++_+_+_???>><>T";
		A=A.replaceAll("[^A-Z]", "");
		System.out.println(A);
	}

}
