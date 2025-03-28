package ch06.unit03;

public class Ex04 {

	public static void main(String[] args) {
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		
		t1.a = 50;
		System.out.println(t1.a + ":" + t2.a); // 50:0
		
		System.out.println(t1.sub(10)); // 60
		System.out.println(t2.sub(10)); // 10
		
		/*
		// 클래스 변수를 객체로 접근할 수 있지만 권장하지 않음(경고)
		t1.c = 50;
		System.out.println(t1.c + ", " + t2.c); // 50, 50
		*/
		
		// 클래스 변수, 클래스 메소드는 클래스명으로 접근한다.
		System.out.println(Test4.c);
		Test4.print();
	}

}

class Test4{
	// 필드 : 인스턴스 변수 + 클래스변수
	
	// 인스턴스 변수
	int a; // 메모리를 할당 받을 때 0으로 초기화
	int b = 10; // 메모리를 할당 받을 때 10으로 초기화
	
	// System.out.println("test"); // 컴파일 오류. 선언부에서는 실행문이 올 수 없다.
	
	// 클래스 변수
	static int c = 100;
	
	// 인스턴스 메소드
	public int sub(int n) { // n: 매개변수(지역변수의 일종)
		int s = 0; // 지역 변수
		
		s = a + n;
		
		return s;
	}
	
	// 인스턴스 메소드
	public void disp() {
		// 인스턴스 메소드는 클래스 안의 모든 인스턴스 변수 호출 가능
		System.out.println(a + ":" + b);
		
		// 인스턴스 메소드는 다른 인스턴스 메소드 호출 가능
		int s = sub(3);
		System.out.println(s);
		
		// 인스턴스 메소드는 클래스 변수, 클래스 메소드 호출 가능
		System.out.println(c);
		write();
	}
	
	// 클래스 메소드
	public static void write() {
		System.out.println("write...");
	}
	
	// 클래스 메소드
	public static void print() {
		// 클래스 메소드는 객체를 생성하지 않고 인스턴스 변수나 인스턴스 메소드 호출 불가
		// 클래스 메소드는 this, super 키워드 사용 불가
		// System.out.println(a); // 컴파일 오류
		// disp(); // 컴파일 오류
		
		// 클래스 변수나 다른 클래스 메소드는 호출 가능
		// 동일한 클래스에 존재하는 클래스 변수나 클래스 메소드를 호출할 경우
		//  클래스명 생략 가능
		System.out.println(c);
		write();
		
		// 인스턴스 변수, 인스턴스 메소드는 객체를 생성해서 호출한다.
		Test4 obj = new Test4();
		System.out.println(obj.a);
		
	}
}
