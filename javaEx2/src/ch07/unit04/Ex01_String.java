package ch07.unit04;

public class Ex01_String {
	public static void main(String[] args) {
		// 상수풀에 동일한 문자열이 존재하면 해당 문자열의 주소 반환
		String s1 = "seoul";
		String s2 = "seoul";
		
		// 새로운 객체를 생성하여 문자열 설정
		String s3 = new String("seoul");
		
		System.out.println(s1 + ", " + s2 + ", " + s3);
			// seoul, seoul, seoul
		
		// 문자열에서 == 는 주소를 비교한다.
		System.out.println(s1 == s2); // true. 동일 객체
		System.out.println(s1 == s3); // false. 동일 객체가 아님

		// 해쉬코드
		// 동일 객체는 해쉬코드가 같지만 해쉬코드가 같다고 동일 객체는 아님
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println();
		
		// 문자열은 불변이다. // 값을 바꾸면 기존 문자열은 garbage collector의 대상이 된다.
		s1 += "korea";
		System.out.println(s1 == s2); // false
		System.out.println(s1);
		System.out.println(s2);
		
		// 길이가 0인 문자열이 존재한다.
		String s4 = ""; // 메모리 할당 받은 것.
		System.out.println(s4.length()); // 0, 문자열 길이
		
		// String s5 = null; // 메모리 할당 안 받은 것.
		// System.out.println(s5.length()); // 런타임오류 : NullPointerException
	}

}
