package ch06.unit04;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		t1.disp();
		
		Test3 t2 = new Test3(100);
		t2.disp();		
	}

}

// 생성자도 일반 메소드처럼 중복 정의가 가능하다.
class Test3{
	private int a;
	
	public Test3() {
		System.out.println("인자 없는 생성자");
	}

	public Test3(int n) {
		a = n;
		System.out.println("인자가 있는 생성자");
	}
	
	public void disp() {
		System.out.println("a : " + a);
	}
}