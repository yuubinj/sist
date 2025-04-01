package ch07.unit04;

public class Ex07 {

	public static void main(String[] args) {
		String s;
		int n, m;
		
		s = "    자   바    ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":"); // 왼쪽과 오른쪽 공백 제거
		System.out.println(":" + s.replaceAll("\\s", "") + ":"); // 모든 공백 제거

		n = 30;
		// s = n; // 컴파일 오류
		// s = "" + n; // 정수를 문자열로(문자열 + 기본자료형 => 문자열)
		s = Integer.toString(n);
		System.out.println(s);
		
		n = 123456;
		m = 15;
		s = String.format("%,d", n);
			// 서식에 따라 문자열로 변환
			// printf()와 유사 // printf()는 모니터에 출력. String.format()은 값을 반환
		System.out.println(s); // 123,456
		
		s = String.format("%d %d %d", n, m, n); // 123456 15 123456
		System.out.println(s);

		s = String.format("%1$d %2$d %1$d", n, m); // 123456 15 123456
		System.out.println(s);
		
		s = "자바,스프링,오라클,HTML";
		String[] ss = s.split(",");
			// , 로 분리하여 배열을 반환
		for(String a : ss) {
			System.out.println(a); // 자바 스프링 오라클 HTML
		}
		
		// 문자열의 각 문자에 대한 ASCII 코드값을 byte 배열로 반환
		s = "KOREA";
		byte[] bb = s.getBytes();
		for(byte b : bb) {
			System.out.println(b); // 75 79 82 69 65
		}
		
	}

}
