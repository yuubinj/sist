package ch04.unit02;

import java.util.Scanner;

public class Ex04_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1~3 사이의 정수 ? ");
		n = sc.nextInt();
		
		// default : case 조건을 만족하는 것이 없는 경우에 실행하며
		//			 위치는 상관 없다.
		switch(n) {
		case 3: System.out.println("***"); break;
		case 2: System.out.println("**"); break;
		case 1: System.out.println("*"); break;
		default: System.out.println("입력 에러 입니다."); break; // default 는 초기값
		}

		sc.close();
	}

}
