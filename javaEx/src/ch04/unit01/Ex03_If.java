package ch04.unit01;

import java.util.Scanner;

public class Ex03_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String s;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		/*
		if(n % 2 == 1) {
			s = "홀수";
		}
		System.out.println(n+ " -> " + s); // 컴파일 오류. s가 초기화되어 있지 않음.
		*/
	
		// s = ""; // s 초기화
		s = "홀수가 아닙니다.";
		if(n % 2 == 1) {
			s = "홀수";
		}
		System.out.println(n+ " -> " + s);
	
		sc.close();

	}

}
