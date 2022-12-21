package classProgramming;
import java.util.Scanner;
public class Switch_Case {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner (System.in);
		System.out.println("Put any case : ");
		int A = SC.nextInt();

    
		switch (A) {		
		case 1 :		
		        System.out.println("Put any Value for if 1 : ");
		        int B = SC.nextInt();
		        System.out.println("Put any Value for if 2 : ");
		        int C = SC.nextInt();
		    	    if (B==4|| C==5){
		    	    	System.out.println("ONE");
		                System.out.println("Put any Value String : ");
		                String D = SC.next();
		                if (D.length()==3) {System.out.println("U inserted three digit string which is : "+D);}
		                else if (D.equals("xyyz")) {System.out.println("u insrted : " + D.toUpperCase() );}
		                else if (D.equals("xyzz")) {System.out.println("u insrted : " + D.toUpperCase() );}
		                if (D.charAt(3)=='Z') {System.out.println("u puted input constain xyz : " + D.contains("xyz") );}
		                else {System.out.println("U inserted more than three charachter String ");}
		    	                   }break;
		
		case 2 : System.out.println("Two");break;
		case 3 : System.out.println("Three");break;
		case 4 : System.out.println("Four");break;
		case 5 : System.out.println("Five");break;
		case 6 : System.out.println("Six");break;
		case 7 : System.out.println("Seven");break;
		case 8 : System.out.println("Eight");break;
		case 9 : System.out.println("Nine");break;
		case 10 : System.out.println("Ten");break;
		default : System.out.println("Wrong input");
		}
	}

}
