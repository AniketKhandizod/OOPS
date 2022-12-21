package logical_Programming_BySDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile_WriteData {
	private static  void m1() throws IOException {

		FileWriter FW = new FileWriter("D:\\Software\\TEXT_Write_Logical_Program.txt");
		
		BufferedWriter BW = new BufferedWriter(FW);
		
		BW.write("Selenium with Java");
		BW.write("Selenium with Paython");
		BW.write("Selenium with C#");
		//BW.flush();                            // use to clear text file
		
		
		System.out.println("Finish...");
		
		BW.close();
	}

	public static void main(String[] args) throws IOException {

		m1();
		
	}

}
