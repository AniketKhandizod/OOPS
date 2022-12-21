package Experiment;
interface ZZZ{
	void ASA(String R) ;
	public static void SAAS(int b) {}
	static void SAS(int c) {}	
}
interface ZZZ2 extends ZZZ{
	void ASA2(String T) ;	
}

public class Interface_multilevel_multiple extends DEMO_TO_CALL_IN_INHERITANCE implements ZZZ2  {
	
	public void ASA(String R) {System.out.println("Hii "+R);}
    
    public void ASA2(String T) {System.out.println("Hii "+T);}
    
    Interface_multilevel_multiple(int Z , String g){
    	System.out.println("From constructor = "+ g);
    	System.out.println("From constructor = "+  Z);
    }
	
	

	public static void main(String[] args) {
		ZZZ A = new Interface_multilevel_multiple(55,"Constructor 1");
		A.ASA("From parent interface ");
		
		ZZZ2 B = new Interface_multilevel_multiple(85,"Constructor 2");
		B.ASA2("From child interface");
		
		DEMO_TO_CALL_IN_INHERITANCE Z = new Interface_multilevel_multiple(22,"Constructor 3");
		Z.Exported(96589,555);
		
		System.out.println();
		
	}

}
