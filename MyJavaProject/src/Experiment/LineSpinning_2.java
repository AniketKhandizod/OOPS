package Experiment;

import java.util.ArrayList;

public class LineSpinning_2 extends LineSpinning {

	public static void main(String[] args) {
		ArrayList<String> list = M1("Aniiket");int j = 0;		
		for (int i = 0; i < list.size(); i++) {
			if (j < 7) {
				System.out.print(list.get(i));
				j++;
			} else {
				System.out.println();
				j = 0;
				i = i - 1;
			}
		}
	}
}
