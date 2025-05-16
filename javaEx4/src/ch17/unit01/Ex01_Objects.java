package ch17.unit01;

import java.util.Objects;

public class Ex01_Objects {

	public static void main(String[] args) {
		/*
		  - java.util.Objects 클래스
		    : 객체 비교, 해시코드 생성, null 여부
		      객체 문자열 반환 등의 연산을 수행하는 정적 메소드로 구성
		    : Object 클래스의 유틸리티 클래스
		 */
		
		String s;
		
		// s = null;
		s = "korea";
		
		s = Objects.requireNonNull(s);
			// 객체가 null 이면 NullPointerException 이 발생하고
			//  null 이 아니면 주어진 객체 반환
		System.out.println(s);

		boolean b;
		b = Objects.isNull(s); // null 이면 true, 그렇지 않으면 false
		System.out.println(b);
		
	}

}
