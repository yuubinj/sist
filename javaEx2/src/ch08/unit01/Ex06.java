package ch08.unit01;

public class Ex06 {

	public static void main(String[] args) {
		Demo6 obj = new Demo6(5);
		
		obj.disp();

	}

}

class Test6{
	int x;
	
	public Test6() {
		x = 0;
		System.out.println("상위 클래스-인자없는 생성자");
	}
	
	public Test6(int x) {
		this.x = x;
		System.out.println("상위 클래스-인자 하나인 생성자");
	}
	
	public void print() {
		System.out.println(x);
	}
}

// 상위 클래스에 인자가 없는 생성자와 인자가 있는 생성자가 모두 존재하면
//  하위 클래스는 생성자를 만들지 않아도 가능하다.

class Demo6 extends Test6{
	int a;
	
	public Demo6(){
		// super(); // 생략된 것임
		a = 0;
		System.out.println("하위 클래스-인자 없는 생성자");
	}
	
	public Demo6(int a) {
		this(a, 10);
			// this([인수]); 가 있으면 super([인수]);는 올 수 없다.
		System.out.println("하위 클래스-인자 하나인 생성자");
	}
	
	public Demo6(int a, int x) {
		super(x);
			// super([인수]); 가 있으면 this([인수]);는 올 수 없다.
		System.out.println("하위 클래스-인자 두개인 생성자");
	}
	
	public void disp() {
		System.out.println(a + ", " + x);
	}
}