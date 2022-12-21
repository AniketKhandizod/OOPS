package logical_Programming_BySDET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFile_ReadData {
	
	public static void M1() throws IOException {
		FileReader FR = new FileReader("D:\\Software\\Logical_Program_TEXT_READ.txt");
		BufferedReader BR = new BufferedReader(FR);
		
		String S;
		while((S = BR.readLine())!=null) {
			System.out.println(S);
		}
		BR.close();
	}
public static void M2()throws IOException {
	
	File file = new File("D:\\Software\\Logical_Program_TEXT_READ.txt");
	Scanner SC = new Scanner (file);
	
	while(SC.hasNextLine()) {
		System.out.println(SC.nextLine());
	}
}
public static void M3()throws IOException {
	
	File file = new File("D:\\Software\\Logical_Program_TEXT_READ.txt");
	Scanner SC = new Scanner (file);
	SC.useDelimiter("\\Z");
	System.out.println(SC.next());
}

	public static void main(String[] args) throws IOException {

		//M1();
		M2();
		M3();
		
	}

}



















