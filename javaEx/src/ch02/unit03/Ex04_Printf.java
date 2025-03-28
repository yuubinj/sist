package ch02.unit03;

public class Ex04_Printf {

	public static void main(String[] args) {
		System.out.printf("%d", 123); // 출력 후 라인을 넘기지 않음. 
		System.out.printf("%d\n", 456);
		
		System.out.printf("%d*\n", 123);
		System.out.printf("%10d*\n", 123);
		System.out.printf("%010d\n", 123); //0000000123

		//System.out.printf("%d\n", 'A'); // 런타임 오류
			// 문자는 %d로 출력 불가
		
		//System.out.printf("%d\n", 2200000000); // 컴파일 오류
			// 22억은 int가 아님.
		System.out.printf("%d\n", 2200000000L);
		System.out.println();
		
		System.out.printf("%,d\n", 123456);
			// 3자리마다 , 나오게 하고 싶음.
		System.out.printf("%+d %+d\n", 123, -123);
			// 양수도 + 기호 출력
		System.out.printf("%(d %(d\n", 123, -123);
			// 음수는 () 안에 출력
		
		System.out.printf("%10d*\n", 123);
			// 공백이 앞쪽에
		System.out.printf("%-10d*\n", 123);
			// 좌측 정렬(공백이 우측에)
		System.out.println();
		
		System.out.printf("%f\n", 123.456); //123.456000
		System.out.printf("%.1f\n", 123.456); //123.5
		System.out.printf("%5.0f %5.0f\n", 15.3, 15.7); // (   )15 (   )16
		System.out.println();
		
		System.out.printf("%c\n", 'A'); // 한문자
		System.out.printf("%c\n", 'a');
		System.out.printf("%c %C\n", 'a', 'a'); // 'a' 'A'
			// %C : 소문자를 대문자로 출력
		System.out.printf("%c %c\n", 65, 97); // 'A' 'a'
			// ASCII 코드에 해당하는 문자 출력
		
	}

}