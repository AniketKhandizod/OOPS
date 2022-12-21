package Logical_MyIdea;

public class Palindrom_01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100000; i++) {int Store = 0;int count =0;
			for (int j = 1; j <=i ; j++) {
				//System.out.println(i+"%"+j+" = "+i%j+" count = "+count);
				Store = i%j;
				if (Store ==0) {count++;}
				else {continue;}
				
			
			}
			if (count==2) {System.out.println("Prime = "+i);}
			//System.out.println(i+" count = "+count);
			//System.out.println("-----------------");
			
		}
	}

}
