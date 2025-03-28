package ch02.unit04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 - 정수를 입력 받아 입력 받은 정수를 ASCII 코드로 하는 문자 출력
		 - 출력 예
		   ASCII 코드 ? 65
		   65 -> A
		 */
		
		Scanner sc = new Scanner(System.in);
		int asc;
		
		System.out.print("ASCII 코드값 ? ");
		asc = sc.nextInt();
		
		System.out.printf("%d -> %c\n", asc, asc);
		
		sc.close();
		
	}

}
