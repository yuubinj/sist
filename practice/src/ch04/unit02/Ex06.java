package ch04.unit02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();

		System.out.print("월 ? ");
		m = sc.nextInt();
		
		d = 0;
		switch(m) {
		case 1, 3, 5, 7, 8, 10, 12 -> d = 31;
		case 4, 6, 9, 11 -> d = 30;
		case 2 -> {
				d = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
			}
		}
		if(d != 0) {
			System.out.printf("%d년 %d월은 %d까지 있습니다.", y, m, d);
		} else {
			System.out.println("입력 오류 입니다.");
		}
		sc.close();
	}

}
