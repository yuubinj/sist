package ch04.unit02;

import java.util.Scanner;

public class Ex03_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		// 정수를 입력 받아 3의 배수인지 출력
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		switch(n%3) {
		case 0: System.out.println(n + "은 3의 배수"); break;
		case 1:
		case 2: System.out.println(n + "은 3의 배수가 아님");
		}
		
		sc.close();
		
	}

}
