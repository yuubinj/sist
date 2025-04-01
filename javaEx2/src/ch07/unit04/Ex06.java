package ch07.unit04;

public class Ex06 {

	public static void main(String[] args) {
		String p, s;
		
		p = "\\d{1,3}"; // 1~3자 이내의 숫자
		s = "123";
		System.out.println(s.matches(p)); // true. 패턴이 일치하면 true

		s = "1234";
		System.out.println(s.matches(p)); // false
		
		// 한글로만 구성되고 한 자 이상 // 공백도 불가
		// ^ : ~ 로 시작, $ : 끝, + : 하나 이상
		p = "^[가-힣]+$";
		// p = "^[가-힣]{1,}$";
		s = "자바";
		System.out.println(s.matches(p)); // true
		s = "자1바";
		System.out.println(s.matches(p)); // false
		s = "자 바";
		System.out.println(s.matches(p)); // false
		s = "자ㅋ바";
		System.out.println(s.matches(p)); // false
		
		// 한글 제거
		p = "[가-힣]";
		s = "*자바 스프링5";
		System.out.println(s.replaceAll(p, "")); // * 5

		p = "010-\\d{4}-\\d{4}";
		s = "010-1111-1234";
		System.out.println(s.matches(p)); // true
		
		// 숫자가 아니면 *로 치환
		//[^] : ~이 아니면(반대)
		s = "우리 12 abc 67 &79";
		s =s.replaceAll("[^0-9]", "*");
		System.out.println(s);
		
	}

}
