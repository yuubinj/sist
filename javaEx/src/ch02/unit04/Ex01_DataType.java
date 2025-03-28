package ch02.unit04;

public class Ex01_DataType {

	public static void main(String[] args) {
		// 정수 관련 데이터 타입
		
		// byte : -123 ~ 127
		byte b1;
		byte b2 = 10;
		//byte b3 = 130; // 컴파일 오류. 표현 범위 벗어남.
		//System.out.println(b1); // 컴파일 오류. 초기화되지 않은 변수
		b1 = 100;
		System.out.println(b1 + ", " + b2);
		
		b2 = 50; // 프로그램 실행도중에 값을 변경할 수 있음.
		System.out.println(b2);
		
		// short : 2byte(-32768 ~ 32767)
		short s1, s2 = 100;
		s1 = 'A'; // 문자는 컴퓨터에 ASCII 코드로 저장되므로 숫자 자료형에 대입 가능
		System.out.println(s1 + ", " + s2);
		
		// int : 4byte
		int i1 = 30;
		int i2 = 'a'; // 97
		int i3 = '0'; // 문자 '0'은 ASCII 코드 값 48
		System.out.println(i1 + ", " + i2 + ", " + i3);
		
		i3 = '0' + 'A'; // 48 + 65
		System.out.println(i3);
		
		i1 = 200;
		//b1 = i1; // 컴파일 오류. int > byte 이므로 int 를 byte 대입 불가
		b1 = (byte) i1; //int를 byte로 형 변환하여 대입
		System.out.println(b1); // -56
				// 200 : 1100 1000
				// byte 형은 8번째(가장 앞)가 부호
				// 부호 0 -> 양수 , 1 -> 음수
				// 1100 1000을 (1)100 1000-> 보수를 구하면 56
		
		// long : 8byte
		long l1, l2;
		l1 = 100;
		//l2 = 2200000000; // 컴파일 오류. int 에는 22억이 없음.
		l2 = 2200000000L;
		System.out.println(l1 + ", " + l2);


	}

}