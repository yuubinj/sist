package ch06.unit02;

public class Ex02 {

	public static void main(String[] args) {
		// 객체 선언 및 메모리 할당
		Test2 t = new Test2();

		t.disp();
		
		// t.a = 15; // 컴파일 오류. private 필드는 외부 클래스에서 접근 불가
		t.b += 5;
		t.disp();
	}

}

// 클래스 : 데이터(필드) + 기능(메소드)으로 구성
class Test2{
	// 필드의 접근 제어자
	// private < 디폴트 < protected < public
	
	// 필드(인스턴스변수)
	private int a = 10; 	// 클래스 안에서만 접근 가능
	int b = 20; 			// 디폴트 : 동일한 패키지에서만 접근 가능
	protected int c = 30;	// 동일한 패키지만 접근 가능하지만, 하위클래스는 어디에서나 접근 가능
	public int d = 40;		// 어디에서나 접근 가능
	
	// 메소드(인스턴스메소드)
	public void disp() {
		System.out.println(a+":"+b+":"+c+":"+d);
	}
}
