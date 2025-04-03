package ch07.unit06;

import java.util.Random;

public class Ex02_Random {

	public static void main(String[] args) {
		// Random : 여러 형태의 난수 제공. 연산없이 정수 등의 난수 발생
		Random rnd = new Random();
		int n;
		
		for(int i=1; i<=100; i++) {
			n = rnd.nextInt(100); // 0<=난수<100 사이
			
			System.out.printf("%5d", n);
			if(i%10 == 0) {
				System.out.println();
			}
		}
	}
}
