package ch03.unit01;

public class Ex12 {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = ++a; // a=a+1; b=a; 와 동일한 결과
		System.out.println(a + ", " + b); // 11, 11
		
		a = 10;
		b = a++; // b=a; a=a+1; 와 동일한 결과
		System.out.println(a + ", " + b); // 11, 10

		a = 10;
		b = a++ + a++ + 1; 
		// b = 10 + 11 + 1
		System.out.println(a + ", " + b); // 12, 22

		a = 10;
		b = ++a + ++a + 1;
		// b = 11 + 12 + 1
		System.out.println(a + ", " + b); // 12, 24 
		
		a = 10;
		b = a++ + ++a + ++a + a++ + a++;
		// b = 10 + 12 + 13 + 13 + 14
		System.out.println(a + ", " + b); // 15, 62
		
		a = 10;
		System.out.println(a++ + ", " + ++a + ", " + a++); // 10 12 12
		System.out.println(a); // 13
		
		a = 0;
		b = a---a; // a - --a
		System.out.println(a + ", " + b); // -1, 1
		
	}

}
