package PropertySharing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getPropertyClass {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		String path = "\\src\\PropertySharing\\GlobalData.properties";
		FileInputStream files = new FileInputStream(System.getProperty("user.dir")+path);
		prop.load(files);
		
		String name [] = {"A","B","C","D","E","F","G","H","I","J"};
		prop.setProperty("J", "Last");

		for (int i = 0; i < name.length; i++) {		
		String BrowserName =prop.getProperty(name[i]);
		System.out.println(BrowserName);		
		}
		
	}

}
