package ch02.unit04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 - 문자를 입력 받아 입력 받은 ASCII 코드 출력
		 - 출력 예
		   문자 ? A
		   A -> 65
		 */
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("문자 ? ");
		ch = sc.next().charAt(0);
		
		// System.out.printf("%c -> %d\n", ch, ch); // 런타임오류
		
		System.out.printf("%c -> %d\n", ch, (int)ch);
		
		int n = ch; // char을 int에 넣을 수 있음. char이 더 작으니까
		System.out.printf("%c -> %d\n", ch, n);
		
		sc.close();

	}

}
