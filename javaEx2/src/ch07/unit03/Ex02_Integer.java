package ch07.unit03;

public class Ex02_Integer {

	public static void main(String[] args) {
		String s1, s2;
		int a, b;
		
		s1 = "123";
		s2 = "456";
		System.out.println(s1 + s2); // 123456 문자열 결합
		
		// 문자열을 정수로 변환
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + b);
		
		//a = Integer.parseInt("1,234"); // 런타임오류(NumberFormatException) // , 있어서
		// a = Integer.parseInt("13.5"); // 런타임오류(NumberFormatException) // 소수점 있어서
		// a = Integer.parseInt("b1"); // 런타임오류(NumberFormatException) // 문자가 있어서
		
		// 16진수 형식의 문자열을 정수로 변환
		a = Integer.parseInt("b1", 16);
		System.out.println(a);
		
		a = Integer.parseInt("1100"); // 10진수 문자열을 정수로 변환
		System.out.println(a); // 1100
		
		a = Integer.parseInt("1100", 2); // 2진수 문자열을 정수로 변환
		System.out.println(a); // 12
		
		a = 123;
		s1 = Integer.toString(a); // 정수를 10진수 형식의 문자열로
		System.out.println(s1); // "123"
		
		s1 = Integer.toBinaryString(a); // 10진수 정수를 2진수 형식의 문자열로
		System.out.println(s1); // "1111011"
		
		s1 = Integer.toHexString(a); // 10진수 정수를 16진수 형식의 문자열로
		System.out.println(s1); // "7b"

	}

}
