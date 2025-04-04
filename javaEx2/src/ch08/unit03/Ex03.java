package ch08.unit03;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Sample3();
		Test3 t3 = new Demo3();
		
		t1.disp(); // Test3의 print...
		t2.disp(); // Sample3의 print...
		t3.disp(); // Test3의 print...

	}

}

class Test3 {
	public void print() {
		System.out.println("Test3의 print...");
	}
	
	public void disp() {
		// write(); // 컴파일 오류
		print();
	}
}

class Sample3 extends Test3{
	public void print() {
		// super.print(); // 상위 클래스 print() 메소드에 접근하는 방법
		System.out.println("Sample3의 print...");
	}
	
	public void write() {
		System.out.println("Sample3의 write...");
	}
}

class Demo3 extends Test3 {
	public void sub() {
		System.out.println("Demo3의 sub...");
	}
}