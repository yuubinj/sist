package ch06.unit02;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println(Test6.c); // 클래스 변수 호출
		Test6.sub(); // 클래스 메소드 호출
		System.out.println();
		
		Test6 obj = new Test6();
		System.out.println(obj.b); // 인스턴스 변수 접근
		obj.write(); // 인스턴스 메소드 접근
	}

}

class Test6{
	// 필드 : 인스턴스변수 + 클래스변수
	// 인스턴스 변수
	// 인스턴스 변수는 객체를 생성 후 객체를 통해 접근하여 사용한다.
	int a;
	int b = 10;
	
	// 클래스 변수
	// 클래스 변수는 객체 생성과 무관하게 클래스명을 통해 접근해서 사용한다.
	static int c = 50; // 인스턴스 메소드와 클래스 메소드 모두 사용가능
	
	// 메소드(기능) : 인스턴스메소드 + 클래스메소드
	// 인스턴스 메소드
	// 인스턴스 메소드는 객체를 생성 후 객체를 통해 접근할 수 있다.
	public void write() {
		int x; // 지역변수. write() 에서만 사용 가능
		x = 5; // 지역변수는 자동으로 초기화가 이루어지지 않으므로
			   // 사용 전 값을 할당한다.
		System.out.println(a+":"+b+":"+c+":"+x);
	}
	
	// 클래스 메소드
	// 클래스 메소드는 객체생성과 상관 없이 클래스 이름으로 접근하여 사용
	public static void sub() {
		// 클래스 메소드는 바로 인스턴스변수를 사용할 수 없다.
		// 즉, 클래스 메소드는 객체를 생성 후 객체를 통해 인스턴스 변수 사용
		// System.out.println(a); // 컴파일 오류
		
		Test6 t = new Test6();
		System.out.println(t.a + ":" + c);
	}
}
