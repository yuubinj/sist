package ch07.unit03;

/*
  - Wrapper class
 	: 기본 타입의 데이터를 객체로 처리하기 위해 제공하는 클래스
 	: Integer, Long, Double, Float, Boolean, Short, Byte, Character, Void
 	: 내용불변(immutable)
 	  내용이 변경되면 새로운 영역에 메모리 할당하고 기존 객체는 garbage collector의 대상
 	: int, long, double 등의 기본 타입은 null을 가질 수 없다.
 	: Integer, Long, Double 등의 Wrapper class는 null을 가질 수 있다.
 	: null
 	  객체가 참조되는 영역이 없는 것을 의미
 	: Number
 	  추상클래스로 Integer, Long, Double 등의 숫자 관련 클래스의 상위 클래스
 */

public class Ex01_Wrapper {

	public static void main(String[] args) {
		int a = 10, b;
		Integer obj = null;
		
		// b = null; // 컴파일 오류. 기본타입은 null을 가질 수 없음
		// b = obj; // 런타임 오류
		
		obj = a; // 기본자료형이 Integer 형으로 자동 변환
		b = obj; // Integer 형이 기본자료형(int)로 자동 변환
		
		System.out.println(a + ", " + b + ", " + obj);
			// 10, 10, 10
		
		System.out.println("정수 MAX : " + Integer.MAX_VALUE);
		System.out.println("정수 MIN : " + Integer.MIN_VALUE);
		System.out.println("바이트 수 : " + Integer.BYTES);
		
	}
}
