package ch07.unit04;

public class Ex03 {

	public static void main(String[] args) {
		// String 클래스의 주요 메소드
		
		String s1 = "seoul korea";
		String s2;
		int n;
		
		n = s1.length();
		System.out.println("문자열 길이 : " + n); // 11
		
		// substring(s, e) : s 인덱스에서 e-1 인덱스까지 문자열 추출(e-s개)
		// 인덱스는 0부터 시작
		s2 = s1.substring(6,9); // 6 인덱스에서 (9-6)인 3개 추출
		System.out.println("특정위치 문자열 : " + s2); // kor
		
		// 6 인덱스에서 마지막 문자열까지 추출
		s2 = s1.substring(6);
		System.out.println("특정 인덱스에서 마지막까지 : " + s2); // korea
		
		s2 = s1.toUpperCase();
		System.out.println("모두 대문자로 : " + s2); // SEOUL KOREA
		
		// 특정 위치의 한 문자 추출
		char c = s1.charAt(6);
		System.out.println("6 인덱스 문자 : " + c); // k
		
		// 문자열 비교
		System.out.println(s1.equals("seoul korea")); // true
		System.out.println(s1.equals("seoul KOREA")); // false. 대소문자 구분
		System.out.println(s1.equalsIgnoreCase("seoul KOREA")); // true. 대소문자를 구분하지 않는다.
		
		// 특정 문자열로 시작하면 true
		System.out.println(s1.startsWith("seoul")); // true
		
		// 특정 문자열로 끝나면 true
		System.out.println(s1.endsWith("korea")); // true
		
		// 문자열의 크기 비교
		// 문자열은 >, < 등으로 비교할 수 없다.
		// compareTo() : 문자열을 사전식으로 비교하여 다른 첫번째 문자의 차이를 반환(ASCII 코드)
		n = s1.compareTo("seoul corea"); // 8('k' - 'c')
		System.out.println("asc ii 코드 차이 : " + n);
		System.out.println("java spring".compareTo("java oracle")); // 4('s' - 'o')
		
		
		

	}

}
