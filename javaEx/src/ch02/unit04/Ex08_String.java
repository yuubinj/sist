package ch02.unit04;

public class Ex08_String {

	public static void main(String[] args) {
		
		//String : 문자열을 나타내는 클래스
		
		String s1, s2, s3;
		s1 = "seoul";
		s2 = "korea";
		s3 = s1 + " " + s2; // 문자열 + 문자열 => 문자열(문자열 결합)
		System.out.println(s3);
		
		s3 = ""; // 길이가 0인 문자열
		System.out.println(s3);
		
		s3 = "X" + 'A' + 10; // 문자열 + 일반리터널 => 문자열로 결합
		System.out.println(s3); // "XA10"
		
		s3 = 'A' + 10 + "X";
			// 1) 문자 + 정수 => 정수 + 정수 => 65 + 10
			// 2) 정수 + 문자열 => 문자열로 결합
		System.out.println(s3); // "75X"
		
		s3 = 'A' + 'B' + "X";
			// 1) 문자 + 문자 => 정수 + 정수 => 65 + 66
		System.out.println(s3); // "131X"
			
		s3 = 'A' + "X" + 'B' ;
		System.out.println(s3); // "AXB"

		
	}

}
