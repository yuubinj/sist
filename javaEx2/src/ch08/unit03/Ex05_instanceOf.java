package ch08.unit03;

public class Ex05_instanceOf {

	public static void main(String[] args) {
		Test5 t = new Test5();
		Demo5 d = new Demo5();
		
		System.out.println(t.b + ":" + d.b); // 20:100
		t.print(); // 10 : 20
		
		// Object > Test5 > Demo5
		// up casting
		Test5 t2 = new Demo5();
		Test5 t3 = d;
		Object o = new Demo5();
		
		System.out.println(t2.b); // 필드는 무조건 자기 것
		// System.out.println(t3.c); // 컴파일 오류. Test5에 c 필드가 없음
		System.out.println(((Demo5)t3).c); // 다운캐스팅
		
		t2.print(); // 메소드가 하위에서 재정의 되어 있으면 하위 메소드 호출(상위 메소드는 숨는다.)
		// t2.write(); // 컴파일 오류. Test5에 메소드가 없음.
		((Demo5)t2).write();
		
		// down casting
		// Demo5 d2 = (Demo5)t; // 런타임 오류
			// 업한 것만 다운 가능하기 때문에.
		if(t instanceof Demo5) { // instanceof 연산자 : 객체가 해당 클래스의 객체이면 true 반환
			Demo5 d2 = (Demo5)t;
			System.out.println(d2);
		} else {
			System.out.println("Demo5 객체가 아니다.");
		}
		System.out.println();
		
		if(o instanceof Demo5) {
			Demo5 d2 = (Demo5)o;
			System.out.println("o: " + d2);
		} else {
			System.out.println("Demo5 객체가 아니다.");
		}
		
		// 다운캐스팅 : 반드시 강제 캐스팅 필요. 업한 것만 다운 가능
		Demo5 d3 = (Demo5)t2;
		Demo5 d4 = (Demo5)t3;
		Test5 t4 = (Test5)o;
		System.out.println(d3.c + ", " + d4.c); // 200, 200
		System.out.println(t4.a + ", " + t4.b); // 10, 20
	}

}

class Test5{
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + " : " + b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo5 extends Test5{
	int b = 100;
	int c = 200;
	
	// 재정의
	@Override
	public void print() {
		System.out.println(a + ", " + super.b + ", " + b + ", " + c);
	}
	
	public void write() {
		System.out.println("write...");
	}
}