package ch03.unit02;

public class Ex02 {
	public static void main(String[] args) {
		
		//논리 연산자
		boolean a = true, b = false;
		
		System.out.println("a= " + a + ", " + "b= " + b);
		System.out.println("a && b = " + (a&&b)); // false
			// && : 모든 조건이 참이어야 참
		System.out.println("a || b = " + (a||b)); // true
			// || : 하나의 조건이라도 참이면 참
		System.out.println("! a = " + (! a)); // false
		
	}

}
