package ch07.unit07;

import java.text.NumberFormat;

public class Ex02_NumberFormat {

	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "1,234";
		String s3 = "4567.12";
		int n;
		
		// 문자열 => 숫자로
		// n = Integer.parseInt(s2); // 런타임 오류 (, 때문에)
		n = Integer.parseInt(s2.replaceAll(",", ""));
		System.out.println(n);
		
		// NumberFormat을 이용하여 문자열을 숫자로
		// Number : 추상클래스로 Integer, Long, Double 등의 상위 클래스
		// Integer, Long, Double 등은 상속관계가 아니므로 서로 형변환 불가
		NumberFormat nf = NumberFormat.getInstance();
		try {
			Number n1 = nf.parse(s1); // 반환값은 Number 객체
			Number n2 = nf.parse(s2); // 
			Number n3 = nf.parse(s3);
			
			System.out.println(n1 + "," + n2 + "," + n3);
				// 1000,1234,4567.12

			// System.out.println(n1 + 100); // 컴파일 오류. n1은 객체 이므로 사칙연산 불가
			// Integer obj = (Integer)n1;
			// System.out.println(obj); // 런타임 오류
	
			// NumberFormat 의 parse()는 정수는 Long, 실수는 Double로 변환
			
			Long obj = (Long)n1;
			System.out.println(obj + 100); // 1100
			
			Double obj2 = (Double)n3;
			System.out.println(obj2); // 4567.12
			
			// 실수를 정수부분만 처리하도록 설정
			nf.setParseIntegerOnly(true);
			Number n4 = nf.parse(s3);
			System.out.println(n4); // 4567
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
