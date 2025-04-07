package ch08.unit07;

public class Ex02 {
	public static void main(String[] args) {
		// Test2.User2 obj = new Test2.User2(); // 컴파일 오류
		
		Test2 t = new Test2();
		
		// 외부 클래스의 객체를 이용하여 객체 생성
		Test2.User2 obj = t.new User2();
			// 이런 형식으로는 잘 사용하지 않는다.
			// 일반적으로 외부클래스(Test2) 내의 메소드에서 객체를 생성하여 사용
			// 보안에 유리
		obj.write();
	}
}

class Test2 {
	int a = 10;
	static int b = 20;
	
	// 내부 클래스 : 외부 클래스의 객체가 생성되어야 객체를 생성할 수 있는 클래스.
	class User2 {
		int x = 100;
		
		public void write() {
			System.out.println(a + ", " + b + ", " + x);
			// print(); 가능
		}
	}
	
	public void print() {
		System.out.println("print...");
	}
	
	public void sub() {
		// 일반적으로 메소드 내에서 내부 클래스의 객체 생성 및 활용
		User2 u = new User2();
		u.write();
	}
}