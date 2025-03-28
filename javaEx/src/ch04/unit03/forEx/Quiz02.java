package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		
		do {
			System.out.print("단 ? ");
			dan = sc.nextInt();	
		} while(dan > 9 || dan < 1);
			
		for(int n = 1; n < 10; n++) {
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
		}
		System.out.println();
		
		sc.close();
	}

}
