package ch04.unit02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1~3 사이의 정수 ? ");
		n = sc.nextInt();
		
		switch(n) {
		case 3: System.out.println("***"); break;
		case 2: System.out.println("**"); break;
		case 1: System.out.println("*"); break;
		default: System.out.println("입력 오류입니다.");
		}
		
		sc.close();

	}

}
