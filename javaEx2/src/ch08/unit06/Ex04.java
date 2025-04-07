package ch08.unit06;

public class Ex04 {

	public static void main(String[] args) {
		Cdemo4 obj = new DemoImpl4();
		obj.disp();
	}

}


interface Ademo4{
	public void print();
}

interface Bdemo4{
	public void disp();
}

// 인터페이스는 다중상속 지원
interface Cdemo4 extends Ademo4, Bdemo4{
	public void sub();
}

class DemoImpl4 implements Cdemo4{

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void disp() {
		System.out.println("disp...");
	}

	@Override
	public void sub() {
		System.out.println("sub...");
	}
	
}