package ch04.unit01;

import java.util.Scanner;

public class Ex02_If {

	public static void main(String[] args) {
		// 정수를 입력 받아 홀수인지 판별
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.println(n + "은 홀수 입니다.");
		}
		
		/*
		 if((n&1) == 1){
		 	System.out.println(n + "은 홀수 입니다.");
		 }
		 // 이게 더 빠른 연산
		 // ==이 &보다 연산 순서 먼저 씀.
		 */
		
		sc.close();
		
	}

}
