package ch06.unit04;

public class Ex07 {

	public static void main(String[] args) {
		Test7 t = new Test7("호호호");
		t.disp();
		

	}

}

class Test7{
	private String name;
	private int age;
	
	public Test7() {
		System.out.println("인자 없는 생성자");
	}
	
	public Test7(String name) {
		// this.name = name;
		// Test(name, 10); // 컴파일 오류. 생성자는 객체를 생성할 때에만 호출(new 다음에 기술)
						   // 생성자는 일반 메소드처럼 호출 불가
		this(name, 10); // 다른 생성자의 몸체 실행 - 코드만 실행. 메모리 할당은 안됨.
			// 최상단 한번만 기술 가능
		System.out.println("인자 하나의 생성자");
	}

	public Test7(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("인자 두 개의 생성자");
	}
	
	public void disp() {
		System.out.println(name + " : " + age);
	}
}