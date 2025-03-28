package ch04.unit01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int id, mid_g, final_g, absence, report_g, total, att_g;
		String name;
		char grade;
		
		System.out.print("학번 ? ");
		id = sc.nextInt();
		System.out.print("이름 ? ");
		name = sc.next(); 
		System.out.print("중간고사 점수 ? ");
		mid_g = sc.nextInt();
		System.out.print("기말고사 점수 ? ");
		final_g = sc.nextInt();
		System.out.print("결석횟수 ? ");
		absence = sc.nextInt();
		System.out.print("레포트 점수 ? ");
		report_g = sc.nextInt();
		
		if(absence >= 6) {
			att_g = 0;
		} else if(absence >= 4) {
			att_g = 60;
		} else if(absence >= 2) {
			att_g = 80;
		} else {
			att_g = 100;
		}
		
		total = (int)(mid_g * 0.4 + final_g * 0.4 + att_g * 0.1 + report * 0.1)
		
		if(total >= 90) grade = 'A';
		else if(total >= 80) grade = 'B';
		else if(total >= 70) grade = 'C';
		else if(total >= 60) grade = 'D';
		else grade = 'F';
		
		*/
		
		////////////////아래 -> 선생님 코드////////////////////

		Scanner sc = new Scanner(System.in);
		
		String hak, name;
		int midterm, finals, absence, report, atted;
		int score;
		char grade;

		System.out.print("학번 ? ");
		hak = sc.next();

		System.out.print("이름 ? ");
		name = sc.next(); 
		
		System.out.print("중간고사 점수 ? ");
		midterm = sc.nextInt();
		
		System.out.print("기말고사 점수 ? ");
		finals = sc.nextInt();
		
		System.out.print("결석횟수 ? ");
		absence = sc.nextInt();
		
		System.out.print("레포트 점수 ? ");
		report = sc.nextInt();
		
		// 출석점수
		if(absence >= 6) {
			atted = 0;
		} else if(absence >= 4) {
			atted = 60;
		} else if(absence >= 2) {
			atted = 80;
		} else {
			atted = 100;
		}
		
		// 학점
		midterm *= 0.4;
		finals *= 0.4;
		atted *= 0.1;
		report *= 0.1;
		
		score = midterm + finals + atted + report;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else if(score >= 60) grade = 'D';
		else grade = 'F';

		System.out.println("학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
		System.out.print(hak + "\t");
		System.out.print(name + "\t");
		System.out.print(midterm + "\t");
		System.out.print(finals + "\t");
		System.out.print(atted + "\t");
		System.out.print(report + "\t");
		System.out.print(score + "\t");
		System.out.println(grade);		
		
		sc.close();
		
	}

}
