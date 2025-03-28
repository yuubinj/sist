package ch04.unit03;

public class Quiz_2_09 {

	public static void main(String[] args) {
		// 피보나치수열: 0 1 1 2 3 5 8 13 21 의 합
		int a, b, c;
		int s;
		
		a = 0;
		b = 1;
		s = 0;
		int n = 0;
		
		while(n < 9) {
			// System.out.print(a + " ");
			s += a;
			c = a + b;
			a = b;
			b = c;
			n++;
		}
		System.out.println("결과 : " + s);

	}

}
