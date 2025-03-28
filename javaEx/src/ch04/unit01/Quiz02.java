package ch04.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int y;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println(y + "년도는 윤년입니다.");
		} else {
			System.out.println(y + "년도는 평년입니다.");
		}
		*/
		
		////////////////아래 -> 선생님 코드////////////////////
		
		Scanner sc = new Scanner(System.in);
		int y;
		String s;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			s = "윤년";
		} else {
			s = "평년";
		}
		
		System.out.printf("%d년도는 %s입니다.\n", y, s);
		
		sc.close();

	}

}
