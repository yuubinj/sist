package ch02.unit03;

public class Ex05_Printf {

	public static void main(String[] args) {
		/*
		 - 2진수 : 0, 1
		 - 8진수 : 0 ~ 7
		 - 10진수 : 0 ~ 9
		 - 16진수 : 0 ~ 9, A, B, C, D, E, F
		 */
		
		// 10진수 17 => 16진수 11
		// 10진수 27 => 16진수 1B
		System.out.printf("%x %X %h\n", 27, 27, 27);
			// 1b 1B 1b
		System.out.println();
		
		String s = "Seoul Korea";
		System.out.printf("%s : %S\n", s, s);
			// %s : 소문자는 소문자로, 대문자는 대문자로 출력
			// %S : 소문자를 대문자로 출력
		System.out.printf("%.5s\n", s); // Seoul
			// 앞 5글자 출력
		
		char x = 'a', y = 'b'; // 문자 변수 선언 및 초기화
		
		// a b b a b b a
		System.out.printf("%c %c %c %c %c %c %c\n", x, y, y, x, y, y, x);
		System.out.printf("%1$c %2$c %2$c %1$c %2$c %2$c %1$c\n", x, y);

		
	}

}
