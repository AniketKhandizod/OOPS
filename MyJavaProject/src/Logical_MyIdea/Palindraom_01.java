package Logical_MyIdea;

public class Palindraom_01 {

	public static void main(String[] args) {int V = 1,st=0;

		for (int i = 1; i <10 ; i++) {
			for (int j = i; j <10; j++) {								
				System.out.print(" ");}
			
			
				V=i;
				while(V>0) {
				System.out.print(V);
				V--;}
				V=i;
			    while(V>1) {
				System.out.print(V);
				V--;}
			System.out.println();
				
			}
		}
	}


