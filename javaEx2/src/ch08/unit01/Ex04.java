package ch08.unit01;

/*
  - 하위 클래스의 객체를 생성하는 경우
  	1) 상위 클래스의 필드에 대한 메모리 할당, 기본값 초기화, 초기화 수식 실행
  	2) 하위 클래스의 필드에 대한 메모리 할당, 기본값 초기화, 초기화 수식 실행
  	3) 상위 클래스 초기화 블럭 실행
  	4) 상위 클래스의 생성자 몸체 실행
  	5) 하위 클래스의 초기화 블럭 실행
  	6) 하위 클래스의 생성자 몸체 실행
 */

public class Ex04 {

	public static void main(String[] args) {
		Demo4 obj = new Demo4();
		
		obj.disp();
	}

}

class Test4{
	int a = 100;
	
	public Test4() {
		// super(); // 없으면 컴파일러가 추가(Object 클래스 호출)
		System.out.println("Test4 생성자...");
	}
	
	public void disp() {
		System.out.println("a: " + a);
	}
}

class Demo4 extends Test4{
	int x = 100;
	
	public Demo4() {
		// super(); // 상위클래스의 생성자 몸체 호출
					// 최상단에 한번만 가능
					// 없으면 컴파일할 때 super(); 가 추가되어 상위클래스의 인자 없는 생성자의 몸체 실행
		System.out.println("Demo4 클래스 생성자...");
	}
	
	public void disp() {
		System.out.println(a + ", " + x);
	}
}