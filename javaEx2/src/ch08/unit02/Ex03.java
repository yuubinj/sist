package ch08.unit02;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		
		t.setName("다자바");
		t.setAge(20);
		
		System.out.println(t.toString());
		System.out.println(t);
	}
}

class Test3 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Object 클래스의 toString() 메소드를 재정의
	@Override
	public String toString() {
		String s = String.format("이름: %s, 나이: %d", name, age);
		return s;
	}
}