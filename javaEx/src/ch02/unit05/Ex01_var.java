package ch02.unit05;

public class Ex01_var {

	public static void main(String[] args) {
		// 지역변수 유형 추론 : var-keyword, JDK 10 이상
		// int n = 10;
		var n = 10;
		// var x; // 컴파일 오류. 초기화가 필요.
		int a = n;
		System.out.println(a);
		
		var s = "Java";
		System.out.println(s instanceof String); // true

	}

}
