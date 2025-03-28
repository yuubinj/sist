package ch03.unit03;

public class Ex03 {

	public static void main(String[] args) {
		int a, b ,c;
		
		a = 23;
		b = 12;
		
		// a-물, b-우유, c
		c = a;
		a = b;
		b = c;
		System.out.println(a + ", " + b);

		int x, y;
		x = 15;
		y = 10;
		
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		System.out.println(x + ", " + y);
		
	}

}
