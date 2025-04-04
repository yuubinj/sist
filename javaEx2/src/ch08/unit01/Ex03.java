package ch08.unit01;

public class Ex03 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();

		obj.disp();
	}

}

class Test3{
	int a = 10;
	
	public Test3() {
		System.out.println("Test3 생성자...");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo3 extends Test3{
	int x = 100;
	
	/*
	// 생성자를 만들지 않으면 다음의 디폴트 생성자가 컴파일할 때 자동으로 만들어진다.
	public Demo3(){
		super(); // 상위 클래스의 생성자 몸체 호출
	}
	 */
	public void disp() {
		System.out.println(a + ", " + x);
	}
}