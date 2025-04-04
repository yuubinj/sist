package ch08.unit01;

public class Ex01_Inheritance {

	public static void main(String[] args) {
		Demo1 dm = new Demo1();
		
		dm.disp();
		
		// 상위 클래스 필드 접근
		System.out.println(dm.c);
		
		// 상위 클래스 메소드 접근
		dm.print();
	}

}

class Test1{ // Test1의 상위 클래스 : Object
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public void print() {
		System.out.println(a + ":" + b + ":" + c + ":" + d);
	}
}

// Test1 클래스를 상속 받은 하위 클래스 작성
class Demo1 extends Test1{
	int x = 10;
	
	public void disp() {
		// System.out.println(a); // 컴파일 오류. 상위클래스 private 은 접근 불가
		System.out.println("상위에서 물려받은 필드 : " + b + ", " + c + ", " + d);
		System.out.println("x: " + x);
	}
	
	public void write() {
		// 상위 클래스의 메소드 호출
		print();
	}
}