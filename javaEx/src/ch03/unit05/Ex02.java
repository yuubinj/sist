package ch03.unit05;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 정수를 입력 받아 짝수, 홀수 판별하기
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		s = n % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(n + " : " + s);
		
		sc.close();
		
	}

}
