package ch08.unit06;

public class Ex02 {

	public static void main(String[] args) {
		DemoImpl2 obj = new DemoImpl2(); 
		obj.disp();
		obj.print();
		obj.sub();
		
		// up-casting
		Ademo2 obj2 = new DemoImpl2();
		Bdemo2 obj3 = new DemoImpl2();

		// obj2.print(); // 컴파일 오류. Ademo2 에 print() 메소드 없음.
		((DemoImpl2)obj2).print();
		obj3.print();
	}

}

interface Ademo2{
	public void disp();
}

interface Bdemo2{
	public void print();
}

// - 클래스는 2개 이상의 인터페이스를 구현할 수 있다.
// - 클래스의 다중 상속이 지원되지 않는 부분을 보강

class DemoImpl2 implements Ademo2, Bdemo2{

	@Override
	public void print() {
		System.out.println("Bdemo2 - print 메소드");
		
	}

	@Override
	public void disp() {
		System.out.println("Ademo2 - disp 메소드");
		
	}
	
	public void sub() {
		System.out.println("sub - 클래스에 정의된 메소드");
	}
}