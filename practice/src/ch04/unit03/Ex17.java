package ch04.unit03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 입력값을 받아서 0부터 입력값까지의 합 구하기. 입력값이 1 이상이 아니면 오류 출력
		
		Scanner sc = new Scanner(System.in);
		int n, num, s;
		
		System.out.print("정수 ? ");
		num = sc.nextInt();
		
		if(num >= 0) {
			n = 0;
			s = 0;
			while(n < num) {
				n ++;
				s += n;
			}
			System.out.printf("0~%d까지의 합 : %d", num, s);
		} else {
			System.out.println("0 이상의 정수만 입력해 주세요.");
		}
		
		sc.close();
	}

}
