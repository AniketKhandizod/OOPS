package GUI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Gui_2 {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("logo.png");
		
		
		JLabel lable = new JLabel();  // creat lable
		lable.setText("Hello Frame");  // set lable 
		
		JFrame frame = new JFrame ();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(lable);
		lable.setIcon(image);
		
		
		

	}

}
