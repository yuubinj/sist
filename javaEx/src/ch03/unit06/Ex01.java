package ch03.unit06;

public class Ex01 {
	public static void main(String[] args) {
		short a, b;
		
		a = 10; b = 5;
		a = (short)(a + b); // 형변환을 해야 함
		System.out.println(a);
		
		a = 10; b = 5;
		a += b; // 형변환이 일어나지 않으므로 위 연산보다 빠름
		System.out.println(a);
		
		char c = 'A';
		c += 10;
		System.out.println(c); // K // 형변환이 일어나지 않음.
		
		float f = 3.5f;
		c = 'A';
		c += f;
		System.out.println(c); // D
		
		int n = 4;
		n *= 0.5;
		System.out.println(n); // 2
		
	}

}
