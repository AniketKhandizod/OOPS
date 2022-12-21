package UDEMY;

interface DD {
	String N1();

	public void N2();
}

abstract class ABlass0 {

	abstract public int M1();

	abstract void M2();

	static void M3() {
		System.out.println("A");
	}

	public static void main(String[] args) {

		M3();
	}

}

public class ABlass extends ABlass0 implements DD {

	@Override
	public int M1() {
		return 0;

	}

	@Override
	void M2() {

	}

	@Override
	public String N1() {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public void N2() {
		// TODO Auto-generated method stub

	}

}
