package classProgramming;

public class delete {

	public static void main(String[] args) {

		String name = "Aniket";
		String store = "";
		
		for(int i=name.length()-1;i>=0;i--){
		
		store=store+name.charAt(i);
		}
		System.out.println(store);
	}

}
