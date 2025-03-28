package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 입력 받은 수까지 합 구하기
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int n, s;
		
		do {
			System.out.print("수 ? ");
			n = sc.nextInt();	
		} while(n > 1000 || n < 1);
			
		s = 0;
		for(int i = 0; i <= n; i++) {
			s += i;
		}
		System.out.printf("1~%d까지 합 : %d\n", n, s);

		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int input;
		int s;
		
		do {
			System.out.print("수 ? ");
			input = sc.nextInt();	
		} while(input < 1 || input > 1000);
			
		s = 0;
		for(int n = 1; n <= input; n++) {
			s += n;
		}
		System.out.printf("1~%d까지 합 : %d\n", input, s);

		sc.close();
		
	}

}
