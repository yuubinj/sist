package ch08.unit02;

public class Ex02 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.setName("김자바");
		t.setAge(20);
		
		System.out.println(t.getName() + " : " + t.getAge());
		System.out.println(t.toString());
			// 클래스이름@해쉬코드
		System.out.println(t);
			// print() 에서는 t 는 t.toString() 과 동일한 결과 
	}

}

class Test2 {
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
}