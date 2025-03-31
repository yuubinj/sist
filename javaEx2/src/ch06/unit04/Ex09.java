package ch06.unit04;

/*
  - 클래스가 로딩될 때 한번 실행
    1) 클래스 변수 메모리 할당 - 메소드영역
    2) 클래스변수를 디폴트 값으로 초기화
    3) 초기화 변수 수식 실행(존재하는 경우)
    4) static 초기화 블럭 실행(존재하는 경우)
    
  - 객체를 생성할 때마다 실행
    1) new Test9()
       객체를 위한 메모리할당(인스턴스 변수 메모리 할당) : a,b,c,d
    2) 모든 인스턴스 변수를 디폴트 값으로 초기화
    3) 초기화 수식으로 초기화(존재하는 경우)
    4) 인스턴스 초기화 블럭 실행(존재하는 경우)
    5) 생성자 몸체 실행
       (1) 생성자 몸체의 첫번째 문장의 super([인수]); 또는 this([인수]); 실행
       (2) 생성자 몸체 실행
 */

public class Ex09 {

	public static void main(String[] args) {
		Test9 t = new Test9();
		t.disp();
		
		System.out.println();
		
		Test9 t2 = new Test9();;
		t2.disp();
	}
}

class Test9{
	// 인스턴스 변수 : 객체가 생성될 때마다 메모리 할당
	private int a;
	private int b = 1;
	private int c;
	private int d;
	
	// 클래스 변수 : 클래스가 로딩될 때 단 한번 메모리 할당
	public static int x = 10;
	public static int y;
	
	// static 초기화 블럭
	// 클래스가 로딩될 때 단 한번 실행
	static {
		y = 20;
		System.out.println("static 초기화 블럭");
	}
	
	// c = 5; // 컴파일 오류. 선언부에 실행문이 올 수 없다.
	// 인스턴스 초기화 블럭 - 인스턴스 초기화 작업은 보통 생성자에서 하기 때문에 사용할 일 거의 없다.
	// 객체가 생성될 때마다 실행
	{ // 사용할 일 99% 없다.
		d = 5;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public Test9() {
		c = 10;
		System.out.println("생성자...");
	}
	
	public void disp() {
		System.out.println(a+","+b+","+c+","+d+","+x+","+y);
	}
}