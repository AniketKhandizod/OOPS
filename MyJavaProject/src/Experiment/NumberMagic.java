package Experiment;

public class NumberMagic {
	//@Deprecated
	static void m1() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
				if(j==0) {System.out.print("*");}
				if(j==i) {System.out.print("*");}
			}
			for (int j = 5; j >= 0; j--) {
				System.out.print(" ");
				if(j==i) {System.out.print("*");}
			}System.out.println();
			
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" ");
				if(i==1) {System.out.print("*");}
				if(j==4&&i!=1&&i!=5) {System.out.print(" *");}
				if(i==5) {System.out.print("*");}
			}System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" ");
				if(i==1&&j<5) {System.out.print("*");}else
				if(j==1) {System.out.print("*");}else
				if(i!=1&&i<=2&&j==5) {System.out.print("  *");}else
				if(j==2&&i==3) {System.out.print("* * *");}else
				if(j==3&&i==4) {System.out.print("*");}else
				if(j==3&&i==5) {System.out.print(" *");}else
				if(j==4&&i==6) {System.out.print(" *");}
			}System.out.println();}
	}

	
	public static void main(String[] args) {

		for (long i = 1; i < 100; i++) {
			
			//System.out.println(i+" = "+259*i*39);
			/*if (i%2!=0) {
				long k = i*(10101010101010101L);
			System.out.println(k);}*/
			//System.out.println(i+" = "+(i | (i+1)));
		}
		m1();
		
	}

}
