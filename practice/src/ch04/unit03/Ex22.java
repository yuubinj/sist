package ch04.unit03;

public class Ex22 {

	public static void main(String[] args) {
		int a, b;
		
		a = 0;
		while(a < 3) {
			a ++;
			System.out.println("a : " + a);
			b = 0;
			while(b < 2) {
				b ++;
				System.out.println("a : " + a + " b : " + b);				
			}
		}

		// a : 1, a : 1, b : 1;
		// a : 1, a : 1, b : 2;
		// a : 2, a : 2, b : 1;
		// a : 2, a : 2, b : 2;
		// a : 3, a : 3, b : 1;
		// a : 3, a : 3, b : 2;
	}

}
