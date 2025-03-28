package ch04.unit03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 단을 입력 받아 구구단 출력하기
		int n, dan;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 ? ");
		dan = sc.nextInt();

		n = 0;
		while(n < 9) {
			n ++;
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
		}
		
		sc.close();
	}

}
