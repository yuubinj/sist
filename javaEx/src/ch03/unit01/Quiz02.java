package ch03.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 초를 입력 받아 시분초 구하기
		Scanner sc = new Scanner(System.in);
		int seconds;
		
		System.out.print("초를 입력하세요 ? ");
		seconds = sc.nextInt();
		
		//1시간 = 60분 = 3600초
		//1시간 50분 10초 = 110분 10초 = 110 * 60 + 10 초
		int h, m, s;
		s = seconds % 60;
		m = (seconds / 60) % 60;
		h = seconds / 60 / 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n", seconds, h, m, s);
		
		sc.close();

	}

}
