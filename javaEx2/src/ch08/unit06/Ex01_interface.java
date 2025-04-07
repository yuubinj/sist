package ch08.unit06;

public class Ex01_interface {

	public static void main(String[] args) {
		// Demo1 obj = new Demo1(); // 컴파일 오류. 인터페이스는 객체 생성 불가
		
		// 인터페이스는 인터페이스를 구현한 클래스의 상위 클래스와 유사하다.
		Demo1 obj = new DemoImpl1(); // up-casting
		obj.print();
		obj.disp();
		
		// obj.sub(); // 컴파일 오류. 인터페이스 Demo1에 sub() 메소드가 없음.
		((DemoImpl1)obj).sub(); // down-casting
		
		// 필드는 인터페이스 명으로 접근
		System.out.println(Demo1.A);
		// Demo1.B = 100; // 컴파일 오류. final 변수는 변경불가
	}

}

// interface : 선언만 있고 정의가 없는 abstract 클래스의 일종
// 인터페이스 작성
interface Demo1 {
	// 인터페이스 필드는 public static final 만 가능
	public static final int A = 10;
	int B = 20; // public static final 을 붙이지 않아도 public static final
	
	// 메소드는 public abstract 만 가능
	// 메소드는 선언만 가능
	public abstract void disp(); // abstract 생략 가능
	void print(); // public abstract 를 붙이지 않아도 public abstract
	
	// public void write() {} // 메소드를 정의하면 컴파일 오류.
}

// 인터페이스 구현
// 인터페이스 구현 클래스는 추상클래스가 아니면 인터페이스의 모든 메소드를 재정의 해야 한다.
class DemoImpl1 implements Demo1{

	@Override
	public void disp() {
		System.out.println("disp-인터페이스 메소드 재정의");
	}

	@Override
	public void print() {
		System.out.println("print-인터페이스 메소드 재정의");
	}
	
	public void sub() {
		System.out.println("sub-클래스에 정의한 메소드");
	}
}