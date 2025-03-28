package ch03.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 ? ");
		int n = sc.nextInt();
		
//		int w50000, w10000, w5000, w1000, w500, w100, w50, w10, w5, w1;
//		w50000 	= 	n / 50000;
//		w10000 	= 	(n % 50000) / 10000;
//		w5000 	= 	((n % 50000) % 10000) / 5000;
//		w1000 	= 	(((n % 50000) % 10000) % 5000) / 1000;
//		w500 	= 	((((n % 50000) % 10000) % 5000) % 1000) / 500;
//		w100 	= 	(((((n % 50000) % 10000) % 5000) % 1000) % 500) / 100;
//		w50 	= 	((((((n % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
//		w10 	= 	(((((((n % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
//		w5 		= 	((((((((n % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) / 5;
//		w1 		=	(((((((((n % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) % 5) /1;
//		
//		System.out.printf("오만원권: %d\n", w50000);
//		System.out.printf("만원권: %d\n", w10000);
//		System.out.printf("오천원권: %d\n", w5000);
//		System.out.printf("천원권: %d\n", w1000);
//		System.out.printf("오백원권: %d\n", w500);
//		System.out.printf("백원권: %d\n", w100);
//		System.out.printf("오십원권: %d\n", w50);
//		System.out.printf("십원권: %d\n", w10);
//		System.out.printf("오원권: %d\n", w5);
//		System.out.printf("일원권: %d\n", w1);
//		
//		sc.close();
		
		System.out.printf("오만원권: %d\n", n / 50000);
		System.out.printf("만원권: %d\n", (n % 50000) / 10000);
		System.out.printf("오천원권: %d\n", (n % 10000) / 5000);
		System.out.printf("천원권: %d\n", (n % 5000) / 1000);
		System.out.printf("오백원권: %d\n", (n % 1000) / 500);
		System.out.printf("백원권: %d\n", (n % 500) / 100);
		System.out.printf("오십원권: %d\n", (n % 100) / 50);
		System.out.printf("십원권: %d\n", (n % 50) / 10);
		System.out.printf("오원권: %d\n", (n % 10) / 5);
		System.out.printf("일원권: %d\n", (n % 5) / 1);
		
		sc.close();

	}

}
