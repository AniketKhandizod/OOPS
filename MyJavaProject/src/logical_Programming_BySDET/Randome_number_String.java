package logical_Programming_BySDET;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Randome_number_String {
	
	public static void Random() {
		
        Random RN = new Random();
		
		for (int i = 0 ; i<= 100;i++) {
		int Int = RN.nextInt(100);//will give answer till 99
		System.out.println(Int);
		
		boolean BO = RN.nextBoolean();
		System.out.println(BO);
		
		double DU = RN.nextDouble(100);
		System.out.println(DU);System.out.println();}
	}
	public static void Math() {
		for (int i=0;i<=100;i++) {
		System.out.println(Math.random());} // only double and 0.something values gives this
	}
	public static void Apache_commons_lang_API_NUmber() {
		for (int i=1;i<=10;i++) {
		String RN = RandomStringUtils.randomNumeric(i);// how many digit u require randomly that we need to put in braket
		System.out.println("For "+i+" Digit random value is = "+RN);} 
	}
	public static void Apache_commons_lang_API_String() {
		for (int i=1;i<=10;i++) {
			String RN = RandomStringUtils.randomAlphanumeric(i);
			System.out.println("For "+i+" Digit random String is = "+RN);}
	}

	public static void main(String[] args) {

		//Random() ;
		//Math();
		Apache_commons_lang_API_NUmber();
		Apache_commons_lang_API_String();
		
	}

}
