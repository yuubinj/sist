package ch07.unit04;

public class Ex05 {

	public static void main(String[] args) {
		// String 클래스의 주요 메소드
		String s1 = "seoul korea";
		String s2;
		int n;
		
		// indexOf()
		//	: 특정문자 또는 문자열이 몇번째 인덱스에 있는지 반환
		//	: 0 인덱스부터 검색
		//	: 없으면 -1을 반환. 0은 처음에 위치
		n = s1.indexOf("kor");
		System.out.println("kor 위치 : " + n); // 6

		n = s1.indexOf("KOR");
		System.out.println("KOR 위치 : " + n); // -1

		// 동일한 문자열이 두 개 이상이면 앞부분의 위치 반환
		n = s1.indexOf("o");
		System.out.println("o 위치 : " + n); // 2

		// 3인덱스 부터 검색
		n = s1.indexOf("o", 3);
		System.out.println("o 위치 : " + n); // 7
		
		// 마지막 인덱스부터 검색
		n = s1.lastIndexOf("o");
		System.out.println("o 위치 : " + n); // 7
		
		boolean b = s1.contains("ko"); // 대소문자 구분
		System.out.println("포함 여부 : " + b);
		
		s1 = "우리나라 대한민국 대한사랑";
		s2 = s1.replace("대한", "大韓"); // 정규식 사용불가
		System.out.println(s2);
		
		s2 = s1.replaceAll("대한", "大韓"); // 정규식 사용가능
		System.out.println(s2);
		
		// \\s:공백(엔터, 탭도 포함), \\d:숫자, |: 또는
		s1 = "우리 123 나라 456 대한";
		s2 = s1.replaceAll("\\s|\\d", "");
		System.out.println("공백, 숫자 제거: "+ s2); // 우리나라대한

		s1 = "우리 123 나라 axb 대한AA민국";
		s2 = s1.replaceAll("[a-zA-Z]", ""); // 영문자 제거
		System.out.println("영문자 제거: " + s2); // 우리 123 나라  대한민국
		
		s1 = "우리 123 나라 axb 대한AA민국";
		s2 = s1.replaceAll("[a-zA-Z0-9]", ""); // 영숫자 제거
		System.out.println("영문자, 숫자 제거: " + s2); // 우리  나라  대한민국

		// \\w : 영숫자
		s1 = "우리 123 나라 axb 대한AA민국";
		s2 = s1.replaceAll("\\w", ""); // 영숫자 제거
		System.out.println("영문자, 숫자 제거: " + s2); // 우리  나라  대한민국
		
		s1 = "우리 123 나라 axb 대한AA민국";
		s2 = s1.replaceAll("\\w|[대한]", ""); // 영숫자 제거
		System.out.println("영문자, 숫자, '대한' 제거: " + s2); // 우리  나라  민국
		
	}

}
