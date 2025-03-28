package ch02.unit04;

public class Ex05_DataType {

	public static void main(String[] args) {
		// char : 2byte, 부호없는 정수형
		// 'A'~'Z' : 65 ~ 90
		// 'a'~'z' : 97~122
		// '0' : 48
		// 엔터: 10
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; // 유니코드(16진수)
			// 16진수 41은 10진수 65이므로 'A'
		System.out.println(c1 + ", " + c2 + ", " + c3);
		
		c1 = '대';
		System.out.println(c1);

		// c1 = ''; // 컴파일 오류. 빈문자는 불가능
		// c1 = 'AB'; // 컴파일 오류. 문자는 한글자로 구성
		// c1 = "A"; // 컴파일 오류. 문자열은 char에 대입 불가.
		
		int a = '대';
		System.out.println(a); // 한글 '대'의 유니코드
		
		double b;
		b = 'C';
		System.out.println(b); // 67.0

		int c, d;
		c = 0;
		d = '0'; // 48
		System.out.println(c + ", " + d);
	}

}
