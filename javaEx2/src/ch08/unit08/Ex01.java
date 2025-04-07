package ch08.unit08;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(Color.RED);
			// RED 출력
			// toString() 를 재정의 하면 원하는 내용을 출력할 수 있다.
		
		// 열거형 상수의 기수(선언 위치) 출력
		for(Color c : Color.values()) {
			System.out.println(c + " -> " + c.ordinal()); // RED -> 0
		}
		
		// System.out.println(Color.RED == 0); // 컴파일 오류
		System.out.println(Color.RED.ordinal() == 0); // true
		System.out.println();
		
		Color c = Color.valueOf("GREEN");
			// 지정된 이름의 열거형 반환
		System.out.println(c);
		System.out.println();
		
		Test1 t = new Test1();
		System.out.println(t.getColor());
		
		t.setColor(Color.BLUE);
		Color color = t.getColor();
		
		// switch ~ case 에서는 enum 은 enum 명 생략 가능
		switch(color) {
		case RED : System.out.println("red"); break;
		// case Color.RED : System.out.println("red"); break;
		case GREEN : System.out.println("green"); break;
		case BLUE : System.out.println("blue"); break;
		}
	}
}

enum Color {
	RED, GREEN, BLUE;
}

class Test1 {
	private Color color = Color.RED;
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
}
