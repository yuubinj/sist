package ch02.unit04;

public class Ex06_Escape {

	public static void main(String[] args) {
		
		// 확장열
		System.out.println("a\tb\tc");
		System.out.println("a\nb\nc");
		System.out.println("x\\y"); // \ 출력
		System.out.println('\101'); // 8진수 101 => 65 => A // 문자 하나니까 ''홑따옴표로 표현 가능
		System.out.println('\u0043'); // 유니코드 => 67 => C

	}

}
