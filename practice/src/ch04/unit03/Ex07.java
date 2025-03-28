package ch04.unit03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, n, s;
		System.out.print("양의 정수 ? ");
		n = sc.nextInt();
		
		a = 1;
		s = 0;
		while(a <= n) {
			s += a;
			a += 2;
		}
		System.out.println("합 : " + s);
		
		sc.close();

	}

}
