package Experiment;

public class Design_Pyramid {
	
	public static void main(String[] args) 
    {  
		 
		int i, j;       
		
		for (i=0; i<10; i++)   
		{  
		    
		for (j=2*(10-i); j>=0; j--)         // remove 2 then u will got pyramid    
		{  
		    
		System.out.print(" ");   
		}   
		
		for (j=0; j<=i; j++ )   
		{   
		    
		System.out.print("A ");   
		}   
		
		System.out.println();   
		}   
		}   


}
