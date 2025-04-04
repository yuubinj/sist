package ch08.unit02;

public class Ex04 {

	public static void main(String[] args) {
		Test4 t1 = new Test4("1111", "김자바");
		Test4 t2 = new Test4("1111", "김자바");
		
		System.out.println(t1 == t2); // false
			// 주소 비교
		System.out.println(t1.equals(t2)); // false
			// Object 클래스의 equals()는 주소 비교
	}
}

class Test4 {
	private String hak;
	private String name;
	
	public Test4() {
		
	}
	public Test4(String hak, String name) {
		this.hak = hak;
		this.name = name;
	}
	
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getHak() {
		return hak;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}