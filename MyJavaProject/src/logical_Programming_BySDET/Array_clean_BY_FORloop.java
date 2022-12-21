package logical_Programming_BySDET;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array_clean_BY_FORloop {

	public static void main(String[] args) {

		String X= "A&*&((*(*(&*&(*^&%&^^$%$#%$N()()*&*&*&^*&*IhjbhbblhbhhbhblhjK511615165561E}{{}}{++_+_+_???>><>T";
		
		int lenght = X.length();
		char Store = ' ';
	
		 
		for (int i=0 ; i<lenght;i++) {
			
			char comp = X.charAt(i);
			char B = 'A' ,C = 'N',D = 'I',E = 'K',F = 'E',G = 'T';
			if (comp == B ||comp == C||comp == D||comp == E||comp == F||comp == G ) {
				System.out.print(comp+" ");
				
				
			}
		}
	}

}
