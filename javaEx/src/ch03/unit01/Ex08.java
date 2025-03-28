package ch03.unit01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 가로와 세로의 길이를 입력 받아 사각형의 넓이 및 둘레 계산
		Scanner sc = new Scanner(System.in);
		int w, h;
		int a, b;

		System.out.println("가로 ? ");
		w = sc.nextInt();
		System.out.println("세로 ? ");
		h = sc.nextInt();
		
		a = w * h;
		b = (w + h) * 2;
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
		
		sc.close();
		
	}

}
