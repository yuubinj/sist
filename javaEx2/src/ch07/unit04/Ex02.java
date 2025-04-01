package ch07.unit04;

public class Ex02 {

	public static void main(String[] args) {
		// 문자열 비교
		String s1 = "seoul";
		String s2 = new String("seoul");
		
		// 객체의 == 은 주소를 비교한다.
		System.out.println(s1 == "seoul"); // true. 동일한 주소
		System.out.println(s2 == "seoul"); // false. 주소가 다름

		// 주소가 아닌 문자열 비교
		// String 의 equals()
		//  : Object 클래스의 equals() 메소드를 재정의한 메소드
		//	: 문자열을 비교
		System.out.println(s1.equals("seoul")); // true. 문자열 비교
		System.out.println(s2.equals("seoul")); // true. 문자열 비교
		
	}

}
