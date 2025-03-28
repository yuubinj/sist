package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, t;
		int s, cnt;
		
		System.out.print("두 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			t = a; a = b; b = t;
		}
		
		s = cnt = 0;
		for(int i=a; i<=b; i++) {
			if(i%3==0 || i%5==0) {
				s += i;
				cnt++;
			}
		}
		if(cnt!=0) {
			System.out.println("합 : " + s);			
			System.out.println("평균 : " + s/cnt);			
		} else {
			System.out.println("데이터 입력 오류입니다.");
		}
		sc.close();
	}

}
