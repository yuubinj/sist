package ch06.unit04;

public class Ex01_constructor {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.disp();
		
		/*
		 - 객체 생성 순서
		   1) new 에 의해 객체 메모리 할당
		   	  a 필드가 heap 영역에 메모리 할당
		   2) a 필드를 0(디폴트 값)으로 초기화
		   3) 생성자 몸체 실행 
		   	  a 필드를 10으로 초기화
		 - 생성자 몸체는 객체가 생성될 때 한번만 실행(객체당 한번)
		 */
	}

}

class Test1{
	private int a;
	
	// 생성자
	public Test1() {
		a = 10;
		System.out.println("생성자...");
	}
	
	public void disp() {
		// Test1(); // 컴파일 오류. 생성자는 일반 메소드처럼 호출할 수 없음.
		System.out.println("a : " + a);
	}
}
