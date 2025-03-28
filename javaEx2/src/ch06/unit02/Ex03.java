package ch06.unit02;

public class Ex03 {

	public static void main(String[] args) {
		// 레퍼런스(참조) 변수 선언 및 메모리 할당
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
			// 레퍼런스 변수(메모리를 할당 받은)만큼 필드가 메모리 할당을 받는다.
		
		System.out.println(t1 == t2); // false
				// 다른 곳을 참조. 다른 객체
		t1.b = 100;
		System.out.println(t1.b + ":" + t2.b); // 100:0
		System.out.println();
		
		Test3 t3 = new Test3();
		Test3 t4 = t3;
			// t3과 t4는 동일한 곳을 참조
		System.out.println(t3 == t4); // true
			// t3과 t4는 동일한 객체
		
		t4.b = 50;
		System.out.println(t3.b + ":" + t4.b); // 50:50
		System.out.println();
		
		// 클래스이름@해쉬코드
		// 해쉬코드는 JVM에서 객체를 빠르게 검색하기 위해 사용
		// 같은 객체는 해쉬코드가 같지만 해쉬코드가 같다고 같은 객체는 아니다.
		System.out.println(t1); // ch06.unit02.Test3@31cefde0
		System.out.println(t2); // ch06.unit02.Test3@439f5b3d
		System.out.println(t3); // ch06.unit02.Test3@1d56ce6a
		System.out.println(t4); // ch06.unit02.Test3@1d56ce6a
	}

}

class Test3{
	int a = 100;
	int b;
	
	public void disp() {
		System.out.println(a + ":" + b);
	}
}