package Experiment;
import java.util.Scanner;
//import Experiment.consoleColour.ConsoleColors;

public class Calculator_Complete {
	public static void main(String[] args) {
		for(;;) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Input Char : ");
        char c = sc.next().charAt(0);
       // sc.close();      - it remove the error of resource leak but give error
        
        if (c <= '+') {
        	double FirstNumber,SecondNumber,Answer;
        	System.out.println("Put first value :");
        	FirstNumber = sc.nextDouble();
        	
        	System.out.println("Put Second value :");
    		SecondNumber = sc.nextDouble();
    		
    		Answer = FirstNumber + SecondNumber;
    		System.out.println("Your Answer of Addition : " + Answer);	
    		  continue;                                                  // if i use break statment here then all loop stop here but due to contine statment loop run from begining 
        }                                                                // if i dont use here whether break or continue then is statmnet runs again and then loop start from begining
        if (c <= '-') {
        	double FirstNumber,SecondNumber,Answer;
        	System.out.println("Put first value :");
        	FirstNumber = sc.nextDouble();
        	
        	System.out.println("Put Second value :");
    		SecondNumber = sc.nextDouble();
    		
    		Answer = FirstNumber - SecondNumber;
    		System.out.println("Your Answer of Substraction : " + Answer);	
    		continue ;
        }
        if (c <= '*') {
        	double FirstNumber,SecondNumber,Answer;
        	System.out.println("Put first value :");
        	FirstNumber = sc.nextDouble();
        	
        	System.out.println("Put Second value :");
    		SecondNumber = sc.nextDouble();
    		
    		Answer = FirstNumber * SecondNumber;
    		System.out.println("Your Answer of Multiplication : " + Answer);
    		continue ;
        }
        if (c <= '/') {
        	double FirstNumber,SecondNumber,Answer;
        	System.out.println("Put first value :");
        	FirstNumber = sc.nextDouble();
        	
        	System.out.println("Put Second value :");
    		SecondNumber = sc.nextDouble();
    		
    		Answer = FirstNumber / SecondNumber;
    		System.out.println("Your Answer of Devidation : " + Answer);
    		continue ;
        }
        else {
        	System.out.println("Please select valid inpute");
        	continue ;        	
            }     
        }		 
	}
}



