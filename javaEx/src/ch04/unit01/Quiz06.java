package ch04.unit01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		operator = sc.next().charAt(0);
		
		if(operator == '+') {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if(operator == '-') {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if(operator == '*') {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else if(operator == '/') {
			System.out.println(a + " / " + b + " = " + (a / b));
		} else {
			System.out.println("연산자 입력 오류입니다.");
		}
		*/

		////////////////아래 -> 선생님 코드////////////////////

		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		operator = sc.next().charAt(0);
		
		if(operator == '+') {
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		} else if(operator == '-') {
			System.out.printf("%d - %d = %d\n", a, b, a - b);
		} else if(operator == '*')  {
			System.out.printf("%d * %d = %d\n", a, b, a * b);
		} else if(operator == '/')  {
			System.out.printf("%d / %d = %d\n", a, b, a / b);
		} else {
			System.out.println("연산자 입력 오류입니다.");
		}
		
		sc.close();
		
	}

}
