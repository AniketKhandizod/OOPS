package UDEMY;


import java.lang.reflect.Field;
import java.util.*;

public class ArraySet {
	
	public static int findCapacity(ArrayList<Integer> A) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field F = ArrayList.class.getDeclaredField("elementData");
		F.setAccessible(true);
		return ((Object[]) F.get(A)).length; 
	}
	
	public static void ArrayLList() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ArrayList<Integer>  A = new ArrayList<Integer> ();
		A.add(1);A.add(1);A.add(1);A.add(1);A.add(1);A.add(1);A.add(1);A.add(1);A.add(1);A.add(1);
		System.out.println(A.size());
		System.out.println(findCapacity(A));		
	}
	

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		ArrayLList();
	}

}
