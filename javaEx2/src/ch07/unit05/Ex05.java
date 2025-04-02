package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 날짜를 입력 받아 요일 구하는 프로그램
		// 날짜 ? 2025-04-02
		// 2025-04-02 : 수요일
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("날짜[yyyy-mm-dd] ? ");
			input = sc.next();
		} while(! input.matches("^(\\d{4}-\\d{2}-\\d{2})$"));
		
		/*
		String[] date = input.split("-");
		int y = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]) - 1;
		int d = Integer.parseInt(date[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m, d);
		System.out.printf("%tF : %tA", cal, cal);
		*/
		
		String[] ss = input.split("-");
		int y = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		int d = Integer.parseInt(ss[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d);
		cal.getTime();
		
		String week = String.format("%tA", cal);
		
		System.out.printf("%tF : %s\n", cal, week);
		
		sc.close();
	}

}
