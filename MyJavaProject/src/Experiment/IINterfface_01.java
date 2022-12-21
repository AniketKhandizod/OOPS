package Experiment;

public class IINterfface_01 {

	
	
	public static void main(String[] args) {

		method O = (A,B,C,D,E,F) -> {
			int Z = 0,SW=0;
			int Arr [] = {A,B,C,D,E,F};
		
			for (int i = 0; i < Arr.length-1; i++) {
		
				if (Arr[i]<Arr[i+1]) {

					SW = Arr[i+1];
					Arr[i+1]=Arr[i];
					Arr[i] = SW; 
					}}
				
				
				
			for (int Store : Arr) {Z=Z*10+Store;}
			return Z;
		};
		System.out.println(O.M1(5, 4, 6, 2, 3, 1));
		
	}

}
