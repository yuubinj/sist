package ch03.unit03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int a = 13, b = 20;
		int c, d;
		
		// 짝수 홀수를 판별할 수 있음
		c = a & 1; // 1
		d = b & 1; // 0
		System.out.println(c + ", " + d); // 1, 0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 ? ");
		int n;
		String s;
		
		n = sc.nextInt();
		s = ( n & 1 ) == 0 ? "짝수" : "홀수";
		// s = n % 1  == 0 ? "짝수" : "홀수"; 보다 속도가 빠름
		
		System.out.println(n + " : " + s);
		
		sc.close();
		

	}

}
