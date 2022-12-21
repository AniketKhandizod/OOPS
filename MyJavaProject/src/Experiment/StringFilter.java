package Experiment;

public class StringFilter {

	public static void main(String[] args) {

		String URL = "https://www.youtube.com/watch?v=RgKAFK5djSk&list=PLLGmt3bXA_93pvHgKm7dbEvW410pDFKKl&index=1";
		String UR  ="https://youtu.be/RgKAFK5djSk";
		System.out.println(URL.replace("www.youtube.com", "youtu.be").substring(0, 41));
		//System.out.println(URL.substring(0, 43));
		
	}

}
