package ch06.unit02;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		  - 필드 : 클래스변수 + 인스턴스변수
		  - 클래스 변수
		  	: 클래스가 메모리에 로딩되는 순간 메모리를 할당 받음
		  	: 객체 생성과 상관 없이 한번만 메모리 할당이 됨.
		  	: 클래스가 메모리에서 사라질 때 메모리가 해제
		  	: "클래스명.클래스변수" 형태로 접근하여 사용
		  - 인스턴스변수
		  	: new 생성자() 통해 객체를 생성하면 힙영역에 메모리가 할당
		  	: new 를 이용하여 객체를 생성한 것만큼 메모리가 할당된다.
		  	: 더이상 사용되지 않는 경우 가비지컬렉터에 의해 메모리가 해제됨.
		  	: "객체명.인스턴스변수" 형태로 접근
		 */
		
		// 클래스 변수 접근
		System.out.println(Test4.c);
		
		// 인스턴스 변수 접근
		Test4 t = new Test4();
		System.out.println(t.a); // 0
		// System.out.println(t.b); // 컴파일 오류. private 이므로 접근 불가
		t.disp();

	}

}

class Test4{
	// 필드-인스턴스변수: 객체를 생성해야 접근할 수 있는 변수
	//  인스턴스변수는 new를 통해 객체를 생성할 때 힙영역에 메모리를 할당 받음.
	int a;
	private int b = 10;
	
	// 필드-클래스변수: 객체 생성과 상관없이 접근하여 사용 가능
	//  클래스가 메모리에 로딩되는 순간 메소드영역에 메모리를 할당 받음
	public static int c = 20;
	
	public void disp() {
		System.out.println(a + ":" + b + ":" + c);
	}
}