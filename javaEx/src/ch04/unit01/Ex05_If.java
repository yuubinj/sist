package ch04.unit01;

import java.util.Scanner;

public class Ex05_If {

	public static void main(String[] args) {
		// 세 개의 정수를 입력 받아 적은 수에서 큰 수 순으로 출력
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("세 수 입력 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		/*
		if(a > b && a > c) {
			if(b > c) {
				System.out.println(c + " < " + b + " < " + a);
			} else {
				System.out.println(b + " < " + c + " < " + a);
			}
		} else if(b > a && b > c) {
			if(a > c) {
				System.out.println(c + " < " + a + " < " + b);
			} else {
				System.out.println(b + " < " + c + " < " + b);
			}
		} else if(c > a && c > b) {
			if(a > b) {
				System.out.println(b + " < " + a + " < " + c);
			} else {
				System.out.println(a + " < " + b + " < " + c);
			}
		}
		*/
		
		int t;
		if (a > b) {
			t = a; a = b; b = t;
		}
		if (a > c) {
			t = a; a = c; c = t;
		}
		if (b > c) {
			t = b; b = c; c = t;
		}
		
		System.out.println(a + ", " + b + ", " + c);
			
		sc.close();

	}

}
