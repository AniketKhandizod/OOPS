package PRactice_Delete;
class AA{
	{
		System.out.println("A");
	}
	static {
		System.out.println("ststic A");
	}
}
class SDF extends AA{
	{
		System.out.println("A");
	}
	static {
		System.out.println("ststic A");
	}
}

public class StaticAndNonStaticBlock extends SDF {
	{
		System.out.println("B");
	}
static {
	System.out.println("ststic A");

	}

	public static void main(String[] args) {

		StaticAndNonStaticBlock A = new StaticAndNonStaticBlock();
		
	}

}
