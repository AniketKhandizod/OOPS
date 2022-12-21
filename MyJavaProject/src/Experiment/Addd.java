package Experiment;

public class Addd {

	public static void main(String[] args) {
int k = 1;
		for (int i = 1;i<20;i++) {
			for (int j = 20;j>i;j--) {
				System.out.print(" ");
			}			
			for (int j = 1;j<i+k;j++) {
				System.out.print("+");
			}System.out.println();k++;
			}
		}
	}


