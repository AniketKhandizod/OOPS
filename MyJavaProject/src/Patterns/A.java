package Patterns;

public class A {

	public static void main(String[] args) /* OR we can write here *trhows InterruptedException* */  {
		
		try {
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=5;j++) { Thread.sleep(200);
				if (i==1||i==5||j==1||j==5) {System.out.print("*");}
				else {System.out.print("+");}
			}System.out.println();
		}}
		catch (InterruptedException ugbuiybubjblhbkjkjnlkjnn ){
			 
		}
		
	}

}
