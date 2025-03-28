package ch02.unit03;

/*
    - System.out.printf("출력서식", 출력할 값, 출력할 값)
      : 출력 서식에 따라 값을 출력
      : 츨력 후 라인을 넘기지 않는다.
      : System.out.format("출력서식", 출력할 값, 출력할 값) 와 동일
*/

public class Ex03_Printf {

	public static void main(String[] args) {
		int a, b, c; // 정수형 변수
		a = 13;
		b = 4;
		c = a + b;
		
		System.out.println(a + " + " + b + " = " + c); // 13 + 4 = 17

		System.out.printf("%d + %d = %d\n", a, b, c); // 13 + 4 = 17
		System.out.format("%d + %d = %d\n", a, b, c); // 13 + 4 = 17
		System.out.println();

		System.out.printf("%d + %d = %d\t", a, b, a+b); // 합
		System.out.printf("%d - %d = %d\n", a, b, a-b); // 차
		System.out.printf("%d * %d = %d\t", a, b, a*b); // 곱
		System.out.printf("%d / %d = %d\n", a, b, a/b); // 몫
		System.out.printf("%d %% %d = %d\n", a, b, a%b); // 나머지
			// % : 형식지정 제어문자의 시작
			// %d : 정수를 출력
		    // \n, %n : 라인을 넘김
		    // %% : %가 형식 문자가 아닌 %을 출력할 경우 사용
		
		

	}

}
