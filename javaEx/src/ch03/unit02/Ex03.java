package ch03.unit02;

public class Ex03 {

	public static void main(String[] args) {

		int a;
		boolean b1, b2;
		
		a = 10;
		b1 = false;
		b2 = a > 20 && (b1 = true);
			// && 연산은 앞부분이 false 이면 뒤쪽연산을 하지 않는다.(단축연산)
		System.out.println(b1 + ", " + b2); // false, false

		a = 10;
		b1 = false;
		b2 = a < 20 && (b1 = true);
		System.out.println(b1 + ", " + b2); // true, true
		
		a = 10;
		b1 = false;
		b2 = a < 20 || (b1 = true);
			// || 연산은 앞부분이 true 이면 뒤쪽연산을 하지 않는다.(단축연산)
		System.out.println(b1 + ", " + b2); // false, true

		a = 10;
		b1 = false;
		b2 = a > 20 || (b1 = true);
		System.out.println(b1 + ", " + b2); // true, true
		
	}

}
