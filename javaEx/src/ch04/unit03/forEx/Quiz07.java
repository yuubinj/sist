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
		
		// 적은 수는 a, 큰 수는 b에
		if(a > b) {
			t = a; a = b; b = t;
		}
		
		s = cnt = 0;
		for(int n=a; n<=b; n++) {
			if(n%3==0 || n%5==0) {
				// System.out.print(n + " ");
				s += n;
				cnt++;		
			}
		}
		
		if(cnt !=0) {
			System.out.println("합 : " + s);
			System.out.println("평균 : " + (s/cnt));	
		} else {
			System.out.println("데이터가 존재하지 않습니다.");
		}

		sc.close();
	}

}
