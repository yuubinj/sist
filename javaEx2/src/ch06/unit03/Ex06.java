package ch06.unit03;

// 파라미터 전달 방법
public class Ex06 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		
		int a = 10;
		t.sub1(a); // a: 실매개변수
		System.out.println("a: " + a); // 10
		
		t.sub2(t);
		System.out.println("t.x: " + t.x); // 20
	}

}

class Test6{
	int x = 10;
	
	// call by value : 실매개변수와 형식매개변수가 기억공간을 따로 활보
	public void sub1(int a) { // a: 형식매개변수
		a += 5;
	}
	
	public void sub2(Test6 obj) {
		obj.x += 10;
	}
}