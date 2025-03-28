package ch04.unit02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		switch(n%3) {
		case 0: System.out.println(n + "은 3의 배수입니다."); break;
		case 1: 
		case 2: System.out.println(n + "은 3의 배수가 아닙니다."); break;		
		}
		sc.close();

	}

}
