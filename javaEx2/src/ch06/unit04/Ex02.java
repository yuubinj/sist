package ch06.unit04;

public class Ex02 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.disp();
		
		// Test2 t = new Test2(); // 컴파일 오류. 인자가 없는 생성자가 없음.
		Test2 t = new Test2(100);
		t.fun();
	}

}

class Demo2{
	private int a = 10;
	
	// 생성자가 없으면 자바가 디폴트 생성자를 만든다.
	// 디폴트 생성자는 인자가 없으며 아무런 기능도 구현되어 있지 않다.
	
	public void disp() {
		System.out.println("a : " + a);
	}
}

class Test2{
	private int x;
	
	// 인자 하나의 생성자
	// 생성자가 존재하면 자바는 디폴트 생성자를 만들지 않는다.
	public Test2(int n) {
		x = n;
		System.out.println("인자가 하나인 생성자...");
	}
	
	public void fun() {
		System.out.println("x : " + x);
	}
}