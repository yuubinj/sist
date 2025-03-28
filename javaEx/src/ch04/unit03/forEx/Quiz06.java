package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		int input;
		int min = 0;
		
		System.out.println("10개의 정수를 입력 하세요...");
		min = sc.nextInt();
		for(int i=1; i<10; i++) {
			input = sc.nextInt();
			
			if(min > input) {
				min = input;
			}
		}
		System.out.println("최소값 : " + min);

		*/
		
		/*
		// 처음 입력 받은 수를 초기값으로 할당
		int input;
		int min = 0;
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10; i++) {
			input = sc.nextInt();
			
			if(i == 1 || min > input) { // i==1 은 처음 입력 받은 경우
				min = input;
			}
		}
		System.out.println("최소값 : " + min);
		*/
		
		// 가장 큰 수를 초기값으로 할당
		int input;
		int min = 0x7FFFFFFF; // 정수 중 가장 큰 수
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10; i++) {
			input = sc.nextInt();
			
			if(min > input) { // i==1 은 처음 입력 받은 경우
				min = input;
			}
		}
		System.out.println("최소값 : " + min);
		
		sc.close();
		
	}

}
