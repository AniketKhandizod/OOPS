package Experiment;
import java.util.Scanner;
public class Constructor {
	
	public static String color;
	public static int num;
	
   private Constructor (String Col,int NO){          // we can't use any return type to this constructor bcoz then it will be convert into method
		color = Col ;             // if you write Col =  color then out put will be null
		num = NO;                 // if you write NO = num then out put will be zero (0)
		
	System.out.println("This is showing in constructor color : "+ color);
	System.out.println("This is showing in constructor num :"+num);
	}
	
	public void A (String color,int num) {        //String name ,int size
		
		//color = name;
		System.out.println("This is in method Color string : " + color);
		
		//num = size;
		System.out.println("This is in method number integer : " +num);
    }
     public static void main(String[] args) {
			
		Scanner V = new Scanner (System.in);
		System.out.println("Type String data : ");
		String color = V.next();                      // Read user input and store in color
		System.out.println("Put integer value : ");
		int num = V.nextInt();                        // Read user input and store in num
	   
	    V.close();                 // to solve problem of leak
	    
	    Constructor D = new Constructor(color,num);
		D.A(color,num);
	}
}
