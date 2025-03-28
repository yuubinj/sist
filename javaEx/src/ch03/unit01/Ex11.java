package ch03.unit01;

public class Ex11 {
	
	public static void main(String[] args) {
		
		int a;
		
		a = 10;
		++a; // a = a + 1의 결과와 동일
		System.out.println(a); // 11
		
		a = 10;
		a++;
		System.out.println(a); // 11

		a = 10;
		--a;
		System.out.println(a); // 9

		a = 10;
		a--;
		System.out.println(a); // 9

		double b = 4.3;
		b++;
		System.out.println(b); // 5.3
		
	}

}
