package ch06.unit04;

public class Ex08 {
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.set(5);
		
		Test8.sub(30);
		
		t.disp();
	}

}

class Test8{
	private int a;
	public static int b = 10;
	
	public void set(int a) {
		this.a = a;
	}
	
	public void disp() {
		System.out.println("a: " + a + ", b: " + b);
	}
	
	public static void sub(int b) {
		// b = b + 10; // 매개변수 값 증가
		
		// this.b = b + 10; // 컴파일 오류.
		
		// 클래스 메소드는 객체 생성유무와 상관없이 호출 가능
		// this 는 호출한 객체(즉 객체가 이미 생성되었다는 것이 전제)
		// 클래스 메소드에서는 this 키워드 사용 불가
		
		// 클래스변수와 지역변수명이 동일하면 클래스변수는 클래스명으로 접근
		Test8.b = b + 10;
	}
	
}