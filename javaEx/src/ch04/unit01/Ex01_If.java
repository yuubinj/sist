package ch04.unit01;

import java.util.Scanner;

public class Ex01_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		// 조건식을 만족하는 경우 실행할 문장이 하나인 경우 {} 생략 가능
		if(n < 0)
			n = -n;

		System.out.println("절대 값 : " + n);
		
		sc.close();

	}

}
