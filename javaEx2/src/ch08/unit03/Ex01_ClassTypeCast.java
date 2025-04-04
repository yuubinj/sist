package ch08.unit03;

public class Ex01_ClassTypeCast {

	public static void main(String[] args) {
		/*
		  - 클래스의 형변환은 상속 관계에서만 가능하다.
		  	즉, 클래스는 상속관계가 아니면 어떠한 경우에도 형변환이 안된다.
		  - Integer 클래스와 Long 클래스는 상속관계가 아니므로
		  	형변환이 불가능하다.
		  
		  // Integer a = 10;
		  // Long b = 10; // 컴파일 오류
		  // Long b = a; // 컴파일 오류
		  // Long b = (Long)a; // 컴파일 오류
		 */
		
		Test1 t = new Test1();
		t.print(); // 10, 20
		// System.out.println(t.c); // 컴파일 오류. 하위클래스의 멤버 접근 불가
		System.out.println();
		
		/*
		  - Test1(상위) > Demo1(하위)
		  - up-casting
		  	: 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		  	: up-casting은 언제나 가능
		  	: 형변환을 하지 않아도 된다.
		 */
		Demo1 dm = new Demo1();
		Test1 t1 = dm; // 업캐스팅(상위 클래스 객체가 하위 클래스 객체를 참조)
			// 업캐스팅은 언제나 가능
		
		System.out.println(dm == t1); // true
			// 동일한 영역을 참조
		System.out.println(dm.b); // 100
		System.out.println(t1.b); // 20
			// 업캐스팅 객체라 할지라도 필드는 자기 자신 것을 가리킨다.
		// System.out.println(t1.c); // 컴파일 오류
			// t1이 dm (하위클래스객체)를 참조하고 있지만
			//  컴파일러 관점에서는 t1에 존재하는 필드가 아니므로 에러
			
		t1.print();
			// - 업캐스팅한 객체에서 재정의한 메소드는 숨어버리기 때문에
			//   하위 클래스의 메소드가 호출된다.
			// - 이곳에서는 t1 객체를 이용하여 Test1 클래스의
			//	 print() 메소드를 직접 호출할 수 있는 방법이 없다.
		System.out.println();
		
		// t1.write(); // 컴파일 오류
			// - t1이 업캐스팅 객체라 할지라도 Test1 클래스에
			//   write() 메소드가 없으므로 컴파일 단계에서 에러 발생
		
		t1.disp();
	}

}

class Test1{
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + " : " + b);
	}
	
	public void disp() {
		System.out.println("disp ...");
	}
	
}

class Demo1 extends Test1{
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println("a: " + a + ", b: " + b + ", super.b: " + super.b + ", c: " + c);
	}
	
	public void write() {
		print();
		super.print();
		disp();
		
	}
}