package ch04.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int n;
		double g;
		
		System.out.print("점수 ? ");
		n = sc.nextInt();
		
		g = 0;
		if(n >= 95 && n <= 100) {
			g = 4.5;
		} else if(n >= 90 && n <= 94) {
			g = 4.0;
		} else if(n >= 85 && n <= 89) {
			g = 3.5;
		} else if(n >= 80 && n <= 84) {
			g = 3.0;
		} else if(n >= 75 && n <= 79) {
			g = 2.5;
		} else if(n >= 70 && n <= 74) {
			g = 2.0;
		} else if(n >= 65 && n <= 69) {
			g = 1.5;
		} else if(n >= 60 && n <= 64) {
			g = 1.0;
		} else if(n >= 0 && n <=59) {
			g = 0.0;
		} else {
			System.out.println("오류 입니다.");
		}
		System.out.println("점수 : " + n + ", 평점: " + g);
		*/
		
		////////////////아래 -> 선생님 코드////////////////////

		Scanner sc = new Scanner(System.in);
		int score;
		double grade;
		
		System.out.print("점수 ? ");
		score = sc.nextInt();
		
		if(score >= 0 && score <= 100) {
			if(score >= 95) grade = 4.5;
			else if(score >= 90) grade = 4.0;
			else if(score >= 85) grade = 3.5;
			else if(score >= 80) grade = 3.0;
			else if(score >= 75) grade = 2.5;
			else if(score >= 70) grade = 2.0;
			else if(score >= 65) grade = 1.5;
			else if(score >= 60) grade = 1.0;
			else grade = 0.0;
			
			System.out.printf("점수 : %d, 평점 : %.1f\n", score, grade);

		} else {
			System.out.println("점수 입력 오류 입니다.");
		}
		sc.close();
	}

}
