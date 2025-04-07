package ch08.unit04;

public class Ex03_final {

	public static void main(String[] args) {
		Demo3 dm = new Demo3();
		double result = dm.area(2);
		dm.disp(result);
	}
}

/*
  - final 필드 : 선언시 한번만 초기화 가능. 값을 변경할 수 없다.
  - final 메소드 : 하위 클래스에서 override 할 수 없다.
  - final 클래스 : 하위 클래스를 가질 수 없다.
*/

/*
final class A {}
class B extends A { } // 컴파일 오류. 파이널 클래스는 하위 클래스를 가질 수 없다.
*/

class Test3{
	// final static 필드 : 값 변경 불가
	public static final double PI = 3.141592;
	
	// final 메소드 : 하위 클래스에서 재정의 불가
	public final double area(double r) {
		return r * r * PI;
	}
}

class Demo3 extends Test3{
	public void disp(final double result) {
		// final 매개변수 : 메소드 안에서 값 변경 불가
		System.out.println("결과 : " + result);
	}
}