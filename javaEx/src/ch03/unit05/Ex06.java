package ch03.unit05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 - 년도를 입력 받아 윤년인지 평년인지 판별하기
		   년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면
		   윤년(366)이고 그렇지 않으면 평년(365)이다.
		   윤년은 2월이 29일인 경우를 말함. 
		 */
		
		Scanner sc = new Scanner(System.in);
		int y;
		String s;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		s = y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ? "윤년" : "평년";
		
		System.out.println(y + " -> " + s);
		
		sc.close();
	}

}
