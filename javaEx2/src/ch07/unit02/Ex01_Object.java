package ch07.unit02;

/*
  - Object 클래스
  	: 모든 클래스의 최상위 클래스
 */

public class Ex01_Object {
	public static void main(String[] args) {
		// Test1 클래스의 상위 클래스는 Object 이다.
		
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = t1;
		
		System.out.println(t1.toString()); // 클래스이름@해쉬코드
		System.out.println(t1);
			// print() 메소드에서만 t1 과 t1.toString()는
			//		모두 동일한 결과로 클래스이름@해쉬코드 가 출력된다.
			// 즉, print() 메소드에서는 t1.toString()에서 .toString() 생략할 수 있다.
		System.out.println();
		
		// 객체의 주소 비교
		System.out.println(t1 == t2); // false
			// 객체에서 == 은 주소를 비교한다.
		System.out.println(t1.equals(t2)); // false
			// equals()는 Object 메소드로, 두 객체의 주소를 비교한다.
		System.out.println(t1 == t3); // true
		System.out.println();
		
		// 해쉬코드 : JVM에서 객체를 빠르게 검색하기 위해 만들어진 값
		System.out.println(t1.hashCode()); // 10진수로 출력
		System.out.printf("%h\n", t1.hashCode()); // 16진수로 출력
			// 동일 객체는 해쉬코드가 같지만
			// 해쉬 코드가 같다고 동일 객체는 아니다.
	}
}

class Test1{
	int a = 10;
	int b = 20;
	
	public void disp() {
		System.out.println(a + ", " + b);
	}
}