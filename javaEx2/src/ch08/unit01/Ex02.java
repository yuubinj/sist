package ch08.unit01;

public class Ex02 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		
		obj.disp();
	}

}

class Test2{
	int a = 10;
	int b = 20;
	
	public void print() {
		// System.out.println(this.a + ":" + this.b);
		System.out.println(a + ":" + b);
	}
}

class Demo2 extends Test2{
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x = 50;
		
		System.out.println("a: " + a); // a: 10, super 클래스의 a 필드
		System.out.println("this.a: " + this.a); // this 로도 접근 가능. 상위에서 물려받은 것은 내것이니까.
		System.out.println("super.a: " + super.a); // 하지만 원래는 상위 클래스 것.
 		
		System.out.println("b: " + b); // b: 100, 자신 클래스의 b 필드
		System.out.println("super.b: " + super.b); // b: 20, super 클래스의 b
		
		System.out.println("x: " + x); // x: 50, 지역변수
		System.out.println("this.x: " + this.x); // x: 200, 자신 클래스의 x 필드
		
		System.out.println("y: " + y); // y: 300, 자신 클래스의 y 필드
		System.out.println("y: " + this.y); // y: 300, 자신 클래스의 y 필드
	}
}
