package ch17.unit01;

public class Ex04 {

	public static void main(String[] args) {
		// 매개변수가 하나이고, 리턴타입이 void 인 람다식
		
		// User4 obj = (a) -> { int n = a + 10; System.out.println(n); };
		// User4 obj = a -> { int n = a + 10; System.out.println(n); };
			// 매개변수가 하나인 경우 매개변수의 () 생략 가능 
		User4 obj = a -> System.out.println(a + 10);
			// 실행문이 한줄인 경우 {} 생략 가능
		
		obj.disp(5);
	}
}

// 함수형 인터페이스 : 추상 메소드가 하나인 인터페이스
@FunctionalInterface // 함수형 인터페이스가 아닌 경우 에러 발생시키는 어노테이션
interface User4 {
	public void disp(int a);
	// public void disp2(int a); // 메소드가 두개 이상일 시 람다식 불가
}
