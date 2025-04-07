package ch08.unit04;

public class Ex01_singleton {

	public static void main(String[] args) {
		// Test1 obj = new Test1(); // 컴파일 오류.
		Test1 obj = Test1.getInstance();
		Test1 obj2 = Test1.getInstance();

		if(obj == obj2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}	
	}
}

// 멀티 스레드 환경에서는 동기화 하지 않아 인스턴스가 두 개 만들어질 수 있다.(동시성의 문제)

class Test1{
	private static Test1 t;
	
	private Test1() {	
	}
	
	public static Test1 getInstance() {
		if(t == null) {
			t = new Test1();
		}
		
		return t;
	}
}