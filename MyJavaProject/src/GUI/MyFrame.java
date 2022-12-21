package GUI;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MyFrame extends JFrame
{
      MyFrame (){      // Constructor
    	//  JFrame this = new JFrame();   //here its no need        // this creat this only but not able to display 
                                                // JFrame = GUI window to add component 
       this.setVisible(true);                // This will make this visible which have no dimension 
       this.setSize(420,420);                // set X and Y dimension of this
       this.setTitle("My new GUI Program");  // will seat name to this
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// when we press x (cut) this then they not actually close program they only hide programe so to close it properly we use this command
                        // 1- EXIT_ON_CLOSE - close
                        // 2- HIDE_ON_CLOSE - only hide at close on backgroud it will still running
                        // 3- DO_NOTHING_ON_CLOSE - close button will not work

        this.setResizable(false);                           // Tis will prevent from manually change the size of this (and maximize button will disapper)

        //ImageIcon image = new ImageIcon("lloog.png");     // first import imageicom then download and copy pest in package and this will chnage your logo of this
        //this.setIconImage(image.getImage());             // this will actually initialize our this logo or we can say it set logo

        ImageIcon image = new ImageIcon("logo.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage());
        
        this.getContentPane().setBackground(new Color(100,100,250));
      }
}
