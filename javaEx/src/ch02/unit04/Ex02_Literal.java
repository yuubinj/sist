package ch02.unit04;

public class Ex02_Literal {

	public static void main(String[] args) {
		
		// 정수형 리터널
		int a = 0b101; // 5, 숫자앞 0b : 2진수
		// a = 0b201; // 컴파일 오류. 2진수에는 2가 없음.
		int b = 0101; // 65, 숫자 앞에 0 : 8진수
		int c = 101; // 10진수
		int d = 0x101; // 16진수, 257
		int e = 0xAB; // 16진수, 171
		// int f = AB; // 컴파일 오류. 앞에 0x가 붙어야 16진수로 인식함.
		int f = 1_0_1; // 10진수 101
		long g = 101L; // long
		
		System.out.println(a + ", " + b + ", "+ c);
		System.out.println(d + ", "+ e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
