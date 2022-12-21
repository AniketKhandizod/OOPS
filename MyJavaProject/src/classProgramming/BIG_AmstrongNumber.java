package classProgramming;
public class BIG_AmstrongNumber {
	public static void main(String[] args) {
		for (long i = 1; i <= 999999999999999999L; i++) {
			long a = i, count = 0, store = 1, s = 1,  fin = 0, S = 0,
					c = 0, e = 0;store = a;
			while (store != 0) {store /= 10;count++;}s = a;		
			
			while (s != 0) {c = count;e = s % 10;S = e;
				while (c != 1) {S = S * e;c--;}
				fin = fin + S;
				s /= 10;}

			if (i == fin && i > 10) {
				System.out.println("Amstrong number = " + i);
			}
		}

	}

}
