package UDEMY;

interface A{
	public static final int A = 0;
	
	public void M1(int A);public void M2();
}
interface B extends A{
	 public void M1(); public void M3();public void M2();
}
public class MutlitpleInterace implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void M1() {
		// TODO Auto-generated method stub
		//return String A;
		
	}

	@Override
	public void M2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void M1(int A) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void M3() {
		// TODO Auto-generated method stub
		
	}
}


