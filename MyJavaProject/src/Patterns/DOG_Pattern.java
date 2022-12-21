package Patterns;

public class DOG_Pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j >= i + 1; j--) { // space 1
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // star 1
				System.out.print("*");
			}
			for (int l = 1; l <= 10; l++) { // space 2
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) { // star 2
				System.out.print("*");
			}System.out.println();
			
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 30; j++) { // space 1
				if (((j==4||j==5||j==6||j==7)&&i==2)) {System.out.print(" ");} //eye 1
		   else if (((j==4||j==5||j==6||j==7)&&i==3)) {System.out.print(" ");} //eye 1
		   else if (((j==4||j==5||j==6||j==7)&&i==4)) {System.out.print(" ");} //eye 1
		   else	if (((j==30-4||j==30-5||j==30-6||j==30-7)&&i==2)) {System.out.print(" ");} //eye 2
	       else if (((j==30-4||j==30-5||j==30-6||j==30-7)&&i==3)) {System.out.print(" ");} //eye 2
		   else if (((j==30-4||j==30-5||j==30-6||j==30-7)&&i==4)) {System.out.print(" ");} //eye 2	
		   else	if (((j==11||j==12||j==13||j==14||j==15||j==16||j==17||j==18||j==19)&&i==7)) {System.out.print("#");} //mouth
		   else	if (((j==11||j==12||j==13||j==14||j==15||j==16||j==17||j==18||j==19)&&i==8)) {System.out.print(" ");} //mouth
		   else	if (((j==11||j==12||j==13||j==14||j==15||j==16||j==17||j==18||j==19)&&i==9)) {System.out.print("#");} //mouth
				else {System.out.print("*");}
			}System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = -4; j <= i*3; j++) {
				System.out.print(" ");
				}
			for (int j = 29; j >= i*9; j-=3) {
				System.out.print("**");}
			System.out.println();
		
	}

}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
