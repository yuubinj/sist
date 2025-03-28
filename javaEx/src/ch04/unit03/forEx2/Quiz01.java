package ch04.unit03.forEx2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 7에 가장 가까운 정수
		
		/*
		Scanner sc = new Scanner(System.in);
		int input, dif, closest, min;
		min = 0x7FFFFFFF;
		
		closest = 0;
		System.out.println("5개의 숫자를 입력 하세요...");
		for(int i=1; i<=5; i++) {
			input = sc.nextInt();

			dif = input - 7;
			if(input < 7) {
				dif = -dif;
			}
			if(dif < min) {
				min = dif;
				closest = input;
			}
		}
		System.out.println("7에 가장 가까운 수 : " + closest);

		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int n, diff;
		int min = 0, result = 0;
		// int min = 0x7FFFFFFF, result = 0;
		
		// 가장 처음수를 초기값으로 설정하여 최소값 구하기
		System.out.println("5개의 숫자를 입력 하세요...");
		for(int i=0; i<5; i++) {
			n = sc.nextInt();

			diff = n > 7 ? n - 7 : 7 - n;
			if(i==0 || min > diff) {
				min = diff;
				result = n;
			}
		}
		System.out.println("7에 가장 가까운 수 : " + result);

		sc.close();
		
	}

}
