package ch03.unit02;

public class Ex01 {

	public static void main(String[] args) {
		
		// 관계 연산자
		int a = 10, b =5;
		boolean c;
		
		System.out.println("a: " + a + ", b: " + b);
		
		c= a > b;
		System.out.println("a > b : " + c); // true
		System.out.println("a >= b : " + ( a >= b )); // true
		System.out.println("a < b : " + ( a < b )); // false
		System.out.println("a <= b : " + ( a <= b )); // false
		System.out.println("a == b : " + ( a == b )); // false
		System.out.println("a != b : " + ( a != b )); // true

	}

}
