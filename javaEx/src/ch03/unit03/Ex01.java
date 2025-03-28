package ch03.unit03;

public class Ex01 {

	public static void main(String[] args) {
		
		// 비트단위 연산자
		int a, b;
		
		// 음수만 보수로 처리. 2의 보수 = 1의 보수 + 1
		a = 10; // 0000 1010 
		b = ~a; // 1111 0101
		
		System.out.println(b); // -11
		
		a = -10;
		b = ~a; // 9
		System.out.println(b); // 9
		
		a = 13; // 0000 1101
		b = 7;  // 0000 0111
		System.out.println( (a & b) ); // 5
				// 0000 0101
		System.out.println( (a | b) ); // 15
				// 0000 1111
		System.out.println( (a ^ b) ); // 10
				// 0000 1010
		
	}

}
