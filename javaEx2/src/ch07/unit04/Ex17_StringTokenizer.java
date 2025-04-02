package ch07.unit04;

import java.util.StringTokenizer;

/*
  - StringTokenizer
  	: 문자열을 지정한 구분자로 문자열을 분리하는 클래스
  	: 분리된 문자열을 토큰(token)이라 부른다.
  	: String 의 split() 메소드로도 구분자로 문자열을 분리할 수 있다.
 */

public class Ex17_StringTokenizer {

	public static void main(String[] args) {
		String s, str;
		
		str = "java, oracle, html 5, css 3, javascript";
		
		// StringTokenizer st = new StringTokenizer(str, ","); // 구분자는 출력하지 않음
		// StringTokenizer st = new StringTokenizer(str, ",", true); // 구분자도 출력
		StringTokenizer st = new StringTokenizer(str, ",", false);
			// 구분자 출력하지 않음(기본이 false)
		
		System.out.println("파싱된 문자열 수 : " + st.countTokens());
		
		while(st.hasMoreElements()) { // 파싱된 문자열이 존재하면
			s = st.nextToken(); // 파싱된 하나의 문자열을 반환하고 다음으로 이동
			System.out.println(s);
		}

	}

}
