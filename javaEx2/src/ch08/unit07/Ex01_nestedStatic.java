package ch08.unit07;

public class Ex01_nestedStatic {
	public static void main(String[] args) {
		Test1.User1 obj = new Test1.User1();
		obj.write();
	}
}

class Test1 {
	int a = 10;
	static int b = 0;
	
	// static 중첩 클래스
	//  : 외부 클래스의 객체 생성과 상관 없이 객체를 생성하여 사용 가능
	//  : 컴파일 하면 Test1$User1.class 파일이 생성
	static class User1 {
		int x = 100;
		
		public void write() {
			System.out.println("x: " + x + ", b: " + b);
			// System.out.println(a); // 컴파일 오류
		}
		
		public void sub() {
			Test1 t = new Test1();
			System.out.println(t.a);
		}
	}
	
	public void print() {
		System.out.println("a: " + a + ", b: " + b);
	}
	
	public static void disp() {
		System.out.println(b);
		// System.out.println(a); // 컴파일 오류
	}
}