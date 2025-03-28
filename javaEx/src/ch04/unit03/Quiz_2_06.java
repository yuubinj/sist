package ch04.unit03;

import java.util.Scanner;

public class Quiz_2_06 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int a, b, s;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		s = 0;
		if(b > a) {
			while(a <= b) {
				s += a;
				a++;
			}
			System.out.printf("%d ~ %d 까지의 합 = %d", a, b, s);
		} else {
			while(b <= a) {
				s += b;
				b++;
			}
			System.out.printf("%d ~ %d 까지의 합 = %d", b, a, s);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		int a, b, t;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// 입력 받은 두 수 중 적은 수는 a, 큰 수는 b에 저장
		if(a>b) {
			t = a; a = b; b = t;
		}
		
		// 적은 수에서 큰 수까지 합 구하기
		int n, s;
		n = a;
		s = 0;
		while(n <= b) {
			s += n;
			n++;
		}
		System.out.println(a + "~" + b + " 까지의 합 : " + s);
		
		sc.close();

	}

}
