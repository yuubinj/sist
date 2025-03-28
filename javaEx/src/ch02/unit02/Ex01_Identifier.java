package ch02.unit02;

/*
    - 식별자
      변수, 클래스명, 인터페이스명, 메소드명. 패키지명 등...
*/

public class Ex01_Identifier {
	public static void main(String[] args) {
		String name = "홍길동";
		//String name = "이순신"; // 컴파일 오류.(컴파일 단계에서 오류) 동일한 블럭 내에서는 동일한 변수명 선언 불가
		//String #name = "이순신"; // 컴파일 오류. #과 같은 특수문자 사용 불가
			//식별자는 자바 유니코드 레터로 시작하고 자바유니코드레터, 숫자로 구성될 수 있다.
			//자바유니코드레터? 영문자, _, $, 각국언어
		String _tel = "010-1111-1111";
		String 주소 = "서울";
		
		//String int = "test"; // 컴파일 오류. 예약어는 식별자로 사용 불가
		
		int $age = 20;
		//int a-10 = 10; // 컴파일 오류
		//int a~10 = 10; // 컴파일 오류
		
		System.out.println(name);
		System.out.println(_tel);
		System.out.println(주소);
		System.out.println($age);
		
		
	}

}
