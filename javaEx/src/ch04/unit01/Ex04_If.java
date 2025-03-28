package ch04.unit01;

import java.util.Scanner;

public class Ex04_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		if(n % 2 == 0) { // 조건을 만족한 경우
			System.out.println(n + " -> 짝수");
		} else { // 조건을 만족하지 않은 경우
			System.out.println(n + " -> 홀수");
		}
		
		sc.close();
		
	}

}
