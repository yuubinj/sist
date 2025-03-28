package ch04.unit01;

import java.util.Scanner;

public class Ex06_If {

	public static void main(String[] args) {
		// 한 문자를 입력 받아 대소문자 구분하기
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.print("한 문자 ? ");
		ch = sc.next().charAt(0);

		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " => 대문자");
		} else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " => 소문자");
		} else {
			System.out.println(ch + " => 기타문자");
		}
		
		sc.close();
	}

}
