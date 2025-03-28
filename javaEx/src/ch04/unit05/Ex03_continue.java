package ch04.unit05;

import java.util.Scanner;

public class Ex03_continue {

	public static void main(String[] args) {
		// 5개의 실수를 입력 받아 0보다 큰 수의 합
		// 단, 입력 받은 수가 0 이하이면 다시 입력 받는다.
		
		Scanner sc = new Scanner(System.in);
		double input, s;
		
		s = 0;
		
		System.out.println("0보다 큰 5개의 실수 입력...");
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 ? ");
			input = sc.nextDouble();
			if(input <= 0.0) {
				i--; // 반복하는 수를 변경하면 반복하는 횟수가 달라진다.
				continue;
			}
			s += input;
		}
		System.out.println("결과 : "+ s);

		sc.close();
	}

}
