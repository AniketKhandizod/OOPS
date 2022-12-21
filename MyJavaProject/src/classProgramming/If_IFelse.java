package classProgramming;
import java.util.Scanner;
public class If_IFelse {
	
	 double  A ;
	 double  B ;
	
	public If_IFelse(double A,double B) {
	    this.A=A;
		this.B=B;}
	
	public  void IFelse(String X, String Y) {
		
	 if (X=="XXX"&& Y=="PPP" ) {
	     System.out.println("You Login Succesfully");
	     if (A==0.1 || A==0.2 || A==0.3||A==0.4 ) {
	    	 System.out.println("You input_1 is : "+ A + " Whicj is in between 0.1 to 0.3");
	    	 if (A==0.1&&B==0.5) {
	    		 System.out.println("you puted input 0.1 & 0.5");}}
	     if (B==0.5 || B==0.6 || B== 0.7 || B==0.8) {
	    	 System.out.println("You input_2 is : "+ B + " Whicj is in between 0.5 to 0.6");
	    	 if (A==0.2&&B==0.6) {
	    		 System.out.println("you puted input 0.2 & 0.6");}}
	    
	     else {System.out.println("Wrong input");}}
	 else {System.out.println("You fail to login");}}
	 
	   	 	


	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);     // scanner object
		
		System.out.println("Put Username : ");      // input username
		String Input_Username = SC .next();
		System.out.println("Put Username : ");      // input password
		String Input_Password = SC .next();

		System.out.println("Put any decimal value_1 between 0.1,2,3,4 : ");    // input number
		double Input_1 = SC .nextDouble();
		System.out.println("Put any decimal value_2 between 0.5,6,7,8 : ");     // input number
		double Input_2 = SC .nextDouble();
		
		If_IFelse OBJ = new If_IFelse(Input_1 , Input_2);		
		OBJ.IFelse(Input_Username,Input_Password);}}
