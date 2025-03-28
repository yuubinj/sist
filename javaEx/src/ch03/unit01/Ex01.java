package ch03.unit01;

public class Ex01 {

	public static void main(String[] args) {
		
		// 산술 연산
		int a = 13, b = 5;
		int c, d, e, f, g;
		
		c = a + b;	d = a - b;
		e = a * b;	f = a / b;
		g = a % b;
		
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("덧셈 : " + c);
		System.out.println("뺄셈 : " + d);
		System.out.println("곱셈 : " + e);
		System.out.println("나눗셈 : " + f);
		System.out.println("나머리 : " + g);

	}

}
