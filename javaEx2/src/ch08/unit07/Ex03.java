package ch08.unit07;

public class Ex03 {

	public static void main(String[] args) {
		User3 obj = new User3();
		obj.sub();
	}
}

interface Test3 {
	public void print();
}

class User3 {
	public void sub() {
		// anonymous class 
		Test3 t = new Test3() {
			@Override
			public void print() {
				// 익명 클래스에서 인터페이스 메소드 재정의
				System.out.println("sub - print");
			}
		};
		
		t.print();
	}
	
	public void disp() {
		// anonymous class : 람다식
		Test3 t = () -> System.out.println("disp - print");
		t.print();
	}
}