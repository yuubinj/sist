package ch04.unit02;

import java.util.Scanner;

public class Ex01_switch {

	public static void main(String[] args) {
		/*
		 1~3 사이의 수를 입력 받아 입력 받은 수만큼 * 찍기
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("수 ? ");
		n = sc.nextInt();
		
		// switch : byte, short, char, int, String, enum만 가능 // c 언어에서는 String은 불가
		//	(boolean, long, float, double는 불가)
		// case 다음에는 상수나 리터널만 가능. 수식이나 변수는 불가
		switch(n) {
		case 3: System.out.print("*");
		case 2: System.out.print("#");
		case 1: System.out.print("@");
		}
		System.out.println();
		
		sc.close();

	}

}
