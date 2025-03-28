package ch04.unit03;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan, n;
		
		System.out.print("단 ? ");
		dan = sc.nextInt();
		
		n = 0;
		while(n < 9) {
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
		}
		
		sc.close();

	}

}
