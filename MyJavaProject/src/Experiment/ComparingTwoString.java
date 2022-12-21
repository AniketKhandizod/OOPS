package Experiment;

public class ComparingTwoString {

	public static void main(String[] args) {
		
		String S = "wlfkfnwfnwnwnmvvvovmsvksvolmkvv";
		String A = "wlfkfnwfnwnwnmvvvovmsvksvolmkvv";
		S.toCharArray();
		A.toCharArray();
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i) ==A.charAt(i)) {count++;}
		}

		if (count == S.length()) {
			System.out.println("Both String are same");
		}
	}

}
