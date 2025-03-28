package ch04.unit03;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, n, s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		a = 0;
		s = 0;
		while(a < n) {
			a++;
			s += a;
		}
		System.out.println("결과 : " + s);
		
		sc.close();
	}

}
