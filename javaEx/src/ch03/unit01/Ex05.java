package ch03.unit01;

public class Ex05 {

	public static void main(String[] args) {
		int a;
		double b;
		
		a = 123456;
		// 1의 자리 버림: 123450
		//a = a / 10; // 12345
		a = a / 10 * 10; // 123450
		System.out.println(a);
		
		a = 123456;
		// 1의 자리 반올림: 123460
		a = (a + 5) / 10 * 10;
		System.out.println(a);
		
		a = 123452;
		// 1의 자리 올림: 123460
		// a = ((a / 10) + 1) * 10;
		a = (a + 9) / 10 * 10;
		System.out.println(a);
		
		b = 126.4563;
		//소수점 3째자리에서 반올림하여 2자리 출력 : 126.46
		System.out.printf("%.2f\n", b);
		
		b = 126.4563;
		//소수점 3째자리에서 버리고 2자리 출력 : 126.45
		b = (int)(b * 100) / 100.0; // 100으로 나누면 소수점 나오지 않음.
		System.out.println(b);
		
	}

}
