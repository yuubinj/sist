package ch03.unit01;

public class Ex03 {

	public static void main(String[] args) {
		
		// 정수 연산자 정수 => 결과는 정수
		int a;
		a = 3 / 2 + 1 / 2 + 2 / 3; // 1 + 0 + 0 => 1
		System.out.println(a); // 1
		
		double b;
		b = 3 / 2 + 1 / 2 + 2 / 3; // 1 + 0 + 0 => 1.0
		System.out.println(b); // 1.0

		// 정수 연산자 실수 => 실수 연산자 실수 => 실수
		b = 3 / 2. + 1 / 2 + 2 / 3; // 1.5 + 0 + 0 => 1.5
		System.out.println(b); // 1.5

		b = (double) (3 / 2 + 1 / 2 + 2 / 3); // 1 + 0 + 0 => 1.0
		System.out.println(b); // 1.0
		
	}

}
