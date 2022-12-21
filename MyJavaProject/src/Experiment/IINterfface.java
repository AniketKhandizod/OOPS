package Experiment;
interface method{
	int M1(int A ,int B,int C ,int D,int E ,int F) ;}

public class IINterfface implements method {
	
	public int M1(int A ,int B,int C ,int D,int E ,int F) {
		int Z = A+B;
		return Z;
	}

	public static void main(String[] args) {

		IINterfface OBJ = new IINterfface();
		
	}

}
