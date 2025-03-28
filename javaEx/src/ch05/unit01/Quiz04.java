package ch05.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 달력
		Scanner sc = new Scanner(System.in);
		int []days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String []week = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		int y, m, w, total;
		
		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		} while(y < 1900);

		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		} while(m < 1 || m > 12 );

		// 2월의 마지막 일자
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;

		// 1.1.1 에서 y년 m월 1일까지 전체 일수
		total = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		for(int i=0; i<m-1; i++) {
			total += days[i];
		}
		total++; // 1 더하기
		
		w = total%7; // y년 m월 1일의 요일
		
		// title 출력
		System.out.printf("\t%d년 %d월\n", y, m);
		System.out.println("==================================");
		for(int i=0; i<week.length; i++) {
			System.out.printf("%4s", week[i]);
		}
		System.out.println("\n==================================");

		// 1일 앞 공백 처리
		for(int i=0; i<w; i++) {
			System.out.print("    ");
		}

		// 1일부터 마지막 날짜까지 출력하기
		for(int i=1; i<=days[m-1]; i++) {
			System.out.printf("%4d", i);
			if(++w%7==0) {
				System.out.println();
			}
		}

		System.out.println("\n==================================");		
		sc.close();
	}

}
