package ch03.unit05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 정수를 입력 받아 양수, 음수, 0인지 판별
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		s = n > 0 ? "양수" : (n < 0 ? "음수" : "0");
		
		System.out.println(n + " -> " + s);
		
		sc.close();

	}

}
