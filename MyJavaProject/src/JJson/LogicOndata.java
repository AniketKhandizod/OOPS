package JJson;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class LogicOndata extends DataReader {
	
	 
	
	public  void getData() throws IOException {
//		HashMap <String,String> map = new HashMap<>();
//		map.put("email", "xxyyxx");
//		map.put("password", "xxyyxx");
//		
//		HashMap <String,String> map2 = new HashMap<>();
//		map2.put("email", "xxyyxx");
//		map2.put("password", "xxyyxx");
		
		String path = "\\src\\JJson\\PurchaseOrder.json";
		List<HashMap<String,String>>data=getJsonDataToMap(System.getProperty("user.dir")+path);
		System.out.println(data.get(0)+" "+data.get(1)+" "+data.get(2)+" "+data.get(3)+" "+data.get(4));
		
		//return new Object[][] {{data.get(0)},{data.get(1)}};		
		
	}
//	public static void orderCheck(HashMap <String,String> input) throws InterruptedException {
//		System.out.println(input.get("email")+ input.get("password"));
//		
//		}

	public static void main(String[] args) throws IOException {

		LogicOndata OBJ = new LogicOndata();
		OBJ.getData();
		

	}

}
