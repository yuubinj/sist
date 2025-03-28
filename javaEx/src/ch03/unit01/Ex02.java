package ch03.unit01;

/*
 1) 자바는 정수의 연산을 기본 타입은 int
 2) +, -, *, /, % 연산의 피연산자가
 	byte, short, char 이면 int 로 변환하여 연산한다.
 3) 피 연산자가 리터널인 경우 형변환이 일어나지 않는다.
 */

public class Ex02 {

	public static void main(String[] args) {
		short s1, s2, s3;
		s1 = 10;
		s2 = 15;
		// s3 = s1 + s2; // 컴파일 오류
			// short형 + short형 => int형 + int형 => int형
			// int형(큼)을 short형(작음)에 대입할 수 없으므로 컴파일 오류.
		s3 = (short) (s1 + s2); // 검색 결과 전체를 short로 바꾸어 주기
		System.out.println(s3);
		
		char ch = 'A';
		// ch = ch + 10; // 컴파일 오류
			// char형 + int형 => int형 + int형 => int형
		ch = (char) (ch + 10);
		System.out.println(ch); // 'K'
		
		ch = 'A' + 5; // 피 연산자가 리터널인 경우 형변환이 일어나지 않음. (형변환은 변수에서만 일어남)
		System.out.println(ch); // 'F'
		
		double d = 'A';
		d = d + 10;
		System.out.println(d); // 75.0
		
	}

}
