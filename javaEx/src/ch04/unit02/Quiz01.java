package ch04.unit02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String grade;
		
		System.out.print("점수 ? ");
		n = sc.nextInt();
		
		switch(n / 10) {
		case 10:
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade = "가"; break;
		}
		
		System.out.printf("점수 : %d, 판정 : %s\n", n, grade);
		
		sc.close();
	}

}
