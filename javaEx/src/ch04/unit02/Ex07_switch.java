package ch04.unit02;

import java.util.Scanner;
/*
 - 스위치 표현식(switch Expressions) 반환 값 받기
 	: -> 또는 yield 를 사용하여 반환
 	: default 구문이 필요
 	: yield 키워드는 항상 블록({}) 내부에서만 사용가능
 		int cnt = switch (day) {
 			case MONDAY -> 0;
 			case TUESDAY -> yield 1; // error
 			case WEDNESDAY -> { yield 2; } // ok
 			default -> 0;
 		}
 	: switch Expressions 는 return 키워드를 사용하면 컴파일 에러가 발생
 	: yield 예약어는 case 라벨(:)에도 사용 가능
 */

public class Ex07_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();

		System.out.print("월 ? ");
		m = sc.nextInt();
		
		d = switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		// case 2 -> y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		case 2 -> {
				int n = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
				yield n;
			}
		default -> -1;
		}; // 스위치 표현식은 마지막에 ; 필요
		
		if(d != -1) {
			System.out.printf("%d년 %d월은 %d일까지 있음\n", y, m, d);
		} else {
			System.out.println("입력 에러 입니다.");
		}
		
		sc.close();

	}

}
