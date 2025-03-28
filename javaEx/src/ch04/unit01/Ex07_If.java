package ch04.unit01;

import java.util.Scanner;

public class Ex07_If {

	public static void main(String[] args) {
		// 정수를 입력 받아 3 또는 4의 배수인지 판별
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		// 잘못 작성한 예
		/*
		 * 12가 들어갔을 때 '3과 4의 배수'를 출력하는 if문을 지나지 못한다.
		 * 먼저 해야 하는 if가 있다.
		if(n%3 == 0) {
			System.out.println(n + " -> 3의 배수");
		} else if(n%4 == 0) {
			System.out.println(n + " -> 4의 배수");
		} else if(n%3 == 0 && n%4 == 0) {
			System.out.println(n + " -> 3과 4의 배수");
		} else {
			System.out.println(n + " -> 3 또는 4의 배수가 아님.");
		}
		*/
		
		if(n%3 == 0 && n%4 == 0) { // if(n%12 == 0){
			System.out.println(n + " -> 3과 4의 배수");
		} else if(n%3 == 0) {
			System.out.println(n + " -> 3의 배수");
		} else if(n%4 == 0) {
			System.out.println(n + " -> 4의 배수");
		} else {
			System.out.println(n + " -> 3 또는 4의 배수가 아님.");
		}

		sc.close();

	}

}
