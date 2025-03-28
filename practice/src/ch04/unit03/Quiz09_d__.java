package ch04.unit03;

public class Quiz09_d__ {

	public static void main(String[] args) {
		//피보나치 수열 : 0 1 1 2 3 5 8 13 21
		int a, b, c, s;
		int n;
		
		a = 0;
		b = 1;
		s = 0;
		n = 0;
		while(n < 9) {
			s += a;
			c = a + b;
			a = b;
			b = c;
			n++;
		}
		System.out.println("결과 : " + s);


	}

}
