package Experiment;

public class Array_Storing_Auto {
static int Z=999999999;
	public static void main(String[] args) {
		
		int Store [] = new int [999999999];
		for (int i = 0;i<=10;i++) {
			Store [i] = Z;
			Z+=999999999;
		}
		for (int i = 0;i<=10;i++)
		System.out.println(Store [i]);
		System.out.println("Lenght of array = "+Store.length);
	}

}
