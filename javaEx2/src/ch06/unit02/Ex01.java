package ch06.unit02;

public class Ex01 {

	public static void main(String[] args) {
		// 일반변수(지역변수)
		int x;
		// System.out.println(x); // 컴파일 오류. 초기화 하지 않으면 연산불가.
		
		x = 10;
		System.out.println("x : " + x);
		
		// 객체
		// 1) 레퍼런스변수 선언(객체선언)
		Test1 t1;
		// t1.age = 21; // 컴파일 오류. 초기화 안됨.
		
		// 2) 객체 생성(메모리 할당)
		//    객체 = new 생성자();
		// 생성자는 객첼을 생성할 때 new 다음에 기술한다.
		t1 = new Test1();
		
		// 3) 사용
		//   - 객체의 속성과 메소드 접근 방법
		//     속성 : 객체명.속성명
		//	   메소드 : 객체명.메소드명([인수])
		
		// 속성에 접근
		System.out.println(t1.name + ", " + t1.score + ", " + t1.age);
			// null, 0, 20
		
		// 필드에 값 할당
		t1.name = "김자바";
		t1.score = 85;
		
		// 메소드 호출
		t1.write(); // 김자바 : 85 : 20
		
		// 객체 선언과 동시에 메모리 할당
		Test1 t2 = new Test1();
		t2.write(); // null : 0 : 20
	}
}

// 클래스 : 데이터(필드) + 기능(메소드)으로 구성
// 필드를 초기화하지 않으면 객체가 생성되는 시점에
//  객체는 null, 숫자변수는 0으로 초기화 된다.
class Test1{
	// 필드선언(인스턴스 변수)
	String name;	// 객체가 생성될 때 null로 초기화
	int score;		// 객체가 생성될 때 0으로 초기화
	int age = 20;		// 객체가 생성될 때 20로 초기화
	
	// 메소드(인스턴스 메소드)
	public void write() {
		System.out.println(name + " : " + score + " : " + age);
	}
}