package ch06.unit03;

public class Ex15_overloading {

	public static void main(String[] args) {
		Test15 t = new Test15();
		
		short a = 10;
		t.disp(a); // int.
			// 1) 기본형 중 타입이 크거나 같은 것 중 가장 적은 타입
			// 2) 기본형에 없으면 동일한 타입의 Wrapper class
		
		Short b = 10;
		t.disp(b); // Short
		
		Integer c = 20;
		t.disp(c); // Integer
			// 동일한 Wrapper class 에서 찾고,
			// 없으면 기본 타입 중 크거나 같은 것 중 가장 적은 타입
		
		long l = 10;
		t.disp(l); // Long

		// float f = 10;
		// t.disp(f); // 컴파일 오류

		// Integer 은 Long로 형 변환 불가
		// Float 는 Double로 형 변환 불가
	}

}

// Wrapper class : 기본형 데이터를 객체로 처리할 수 있도록 만들어진 클래스
//  Byte, Short, Character, Integer, Long, Float, Double 등
class Test15{
	public void disp(Short a) {
		System.out.println("Short : " + a);
	}
	
	public void disp(int a) {
		System.out.println("int : " + a);
	}

	public void disp(Integer a) {
		System.out.println("Integer : " + a);
	}
	
	public void disp(Long a) {
		System.out.println("Long : " + a);
	}
	
	public void disp(Double a) {
		System.out.println("Double : " + a);
	}
}