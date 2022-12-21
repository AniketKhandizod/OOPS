package GUI;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Gui_1 {
            
	public static void main (String [] args) {
		
		/*JFrame frame = new JFrame();           // this creat frame only bot not able to display 
		                                       // JFrame = GUI window to add component 
		frame.setVisible(true);                // This will make frame visible which have no dimension 
		frame.setSize(420,420);                // set X and Y dimension of frame
		frame.setTitle("My new GUI Program");  // will seat name to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// when we press x (cut) frame then they not actually close program they only hide programe so to close it properly we use this command
	                                                         // 1- EXIT_ON_CLOSE - close
		                                                     // 2- HIDE_ON_CLOSE - only hide at close on backgroud it will still running
		                                                     // 3- DO_NOTHING_ON_CLOSE - close button will not work
		
		frame.setResizable(false);                           // Tis will prevent from manually change the size of frame (and maximize button will disapper)
		
		ImageIcon image = new ImageIcon("lloog.png");     // first import imageicom then download and copy pest in package and this will chnage your logo of frame
	    frame.setIconImage(image.getImage());             // this will actually initialize our frame logo or we can say it set logo
	
	    frame.getContentPane().setBackground(new Color(100,100,250));  // Change backgroun colour and we can also write =  frame.getContentPane().setBackground(Color.blue);       // (r,g,b) pure value is 255  // you can also use hexa decimal value here (0xFFFFFF)
	    */
	    
	    MyFrame myFrame = new MyFrame();
	
	}
}
