package Polymorphism;

import java.io.EOFException;
import java.io.IOError;
import java.io.IOException;

class EX {
	//void M1() {}
	//void M1()throws Exception  {}
	void M1()throws IOException {System.out.println("A");}  //throws EOFException
		
	
}

public class Exception_01 extends EX {

    //void M1() throws RuntimeException {}
    //void M1() throws Exception  {}
	void M1() throws EOFException  {System.out.println("B");}
    
    
    public static void main(String[] args) throws EOFException {
    	Exception_01 S = new Exception_01();
    	S.M1();
	}
	

}
