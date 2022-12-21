package Patterns;

public class Experiment_Class {
	
	

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (i == 1 || i == 6 ||j == 1 || j == 6)           
                    System.out.print(" "+i);           
                else
                    System.out.print("  ");           
            }
            System.out.println();
        }
		 System.out.println();
		for (int i = 1; i <= 6; i++)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (i == 1 || i == 6 ||j == 1 || j == 6)           
                    System.out.print(" "+i);           
                else
                    System.out.print("  ");           
            }
            System.out.println();
        }
	}

}
