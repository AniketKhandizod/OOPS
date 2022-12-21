package classProgramming;
interface AV{
	int a =10;
	public static void M1() {}
	static void M2() {}
//	default void M4(); 
/*	public void M7() {}
    void M3() {}
    AV(){}
    
    abstract public static void M4();
    abstract static void M5() ;
    abstract AV(int a);   */
    abstract void M6() ;
    abstract public void M8() ;
   
}

abstract class AB {
	int a =10;
	public static void M1() {}
	static void M2() {}
	public void M7() {}
    void M3() {}
    AB(){}
    
  /*abstract public static void M4();
    abstract static void M5() ;
    abstract AB(int a);   */
    abstract void M6() ;
    abstract public void M8() ;
    
    
}

public class Abstractiion extends AB  {

	

	@Override
	void M6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void M8() {
		// TODO Auto-generated method stub
		
	}
	
	
	
    public static void main(String[] args) {

		
		
		
	}

}
