package ch04.unit01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num, name, grade;
		int midterm, finals, absence, report, attd, total;
		
		System.out.print("학번 ? ");
		num = sc.next();
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
		
		// 출석 점수
		if(absence >= 6) {
			attd = 0;
		} else if(absence >= 4) {
			attd = 60;
		} else if(absence >= 2) {
			attd = 80;
		} else {
			attd = 100;
		} 
		
		// 합산 점수
		midterm *= 0.4;
		finals *= 0.4;
		attd *= 0.1;
		report *= 0.1;
		
		total = midterm + finals + attd + report;
		
		if(total >= 90) {
			grade = "A";
		} else if(total >= 80) {
			grade = "B";
		} else if(total >= 70) {
			grade = "C";
		} else if(total >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%s", num, name, midterm, finals, attd, report, total, grade);
		sc.close();
	}

}
