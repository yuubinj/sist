package ch04.unit02;

import java.util.Scanner;

public class Ex07___ {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();

		System.out.print("월 ? ");
		m = sc.nextInt();
		
		d = switch(m) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		case 2 -> {
				int n = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
				yield n;
			}
		default -> -1;
		};
		
		if(d != -1) {
			System.out.printf("%d년 %d월은 %d까지 있습니다.", y, m, d);
		} else {
			System.out.println("입력 오류 입니다.");
		}
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("년 ? ");
		y = sc.nextInt();
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		d = switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> {
			int n = y%4==0 && y%100!=0 || y%400==0 ? 29: 28;
			yield n;
		}
		default -> -1;
		};
		
		if(d != -1) {
			System.out.printf("%d년 %d월은 %d일까지 있습니다.", y, m, d);
		} else {
			System.out.println("날짜 입력 오류 입니다.");
		}
		
		sc.close();
	}

}
