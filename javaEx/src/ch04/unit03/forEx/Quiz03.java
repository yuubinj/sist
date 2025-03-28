package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = b = 0;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i = 1; i <= 10; i++) {
			int n_i;
			n_i = sc.nextInt();
			if(n_i%2==1) {
				a++;
			} else {
				b++;
			}
		}
		System.out.println("홀수의 개수 : " + a);
		System.out.println("짝수의 개수 : " + b);

		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);

		int input;
		int odd, even;
		
		odd = even = 0;
		System.out.println("10개의 정수를 입력 하세요...");

		for(int n = 0; n < 10; n++) {
			input = sc.nextInt();
			
			if(input%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);

		sc.close();
		
	}

}
