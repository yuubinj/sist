package ch04.unit05;

import java.util.Scanner;

public class Ex02_continue {

	public static void main(String[] args) {
		// 5개의 실수를 입력 받아 0보다 큰 수의 합
		
		Scanner sc = new Scanner(System.in);
		double input, s;
		
		s = 0;
		System.out.println("5개의 실수 입력...");
		for(int i=1; i<=5; i++) {
			input = sc.nextDouble();
			if(input <= 0.0) {
				continue;
			}
			s += input;
		}
		System.out.println("결과 : "+ s);

		sc.close();
	}

}
