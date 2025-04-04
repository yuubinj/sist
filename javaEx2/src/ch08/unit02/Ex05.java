package ch08.unit02;

public class Ex05 {

	public static void main(String[] args) {
		Test5 t1 = new Test5("1111", "김자바");
		Test5 t2 = new Test5("1111", "김자바");
		
		System.out.println(t1 == t2); // false
			// 주소비교
		System.out.println(t1.equals(t2)); // true
			// t1의 name과 age를 t2의 name과 age 비교
	}
}


class Test5 {
	private String hak;
	private String name;
	
	public Test5() {
		
	}
	public Test5(String hak, String name) {
		this.hak = hak;
		this.name = name;
	}
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Object 클래스의 equals() 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		Test5 t = (Test5)obj; // Object 객체를 Test5 객체로 다운 캐스팅
		
		return t.getHak().equals(hak) && t.getName().equals(name);
	}
	
}