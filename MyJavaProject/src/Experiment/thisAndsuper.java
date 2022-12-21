package Experiment;
class BBN{
//	BBN(){
//		System.out.println("Super");
//	}
	public BBN(String A){
		System.out.println("Super" +A);
	}
}

public class thisAndsuper extends BBN {
	thisAndsuper(String A){
		super("A"+A);
		
	}

	thisAndsuper(){
		
		this(" A");
		System.out.println("Con");
		
	}
	public static void main(String[] args) {
		thisAndsuper A = new thisAndsuper();
		
	}

}
