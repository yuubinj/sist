package ch08.unit01;

public class Ex05 {

	public static void main(String[] args) {
		// Test5 t = new Test5(); // 컴파일 오류. 인자가 없는 생성자가 없음.
		// Test5 t = new Test5(50);
		
		Demo5 d = new Demo5();
		d.disp();
		
	}

}

class Test5{
	int x;
	
	// 인자가 있는 생성자만 존재
	public Test5(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("x: " + x);
	}
}

/*
  - 상위 클래스에 인자가 있는 생성자만 존재하는 경우
    하위 클래스는 반드시 생성자를 만들고
    명시적으로 상위 클래스의 생성자를 호출해야 한다.
 */

class Demo5 extends Test5{
	int a = 10;
	
	public Demo5() {
		// super(); // 컴파일 오류. 상위 클래스에 인자가 없는 생성자가 없음
		super(100); // 상위 클래스의 인자가 있는 생성자 호출
	}
	
	public void disp() {
		System.out.println(a);
	}
}