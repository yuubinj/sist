package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		char operator;
		
		System.out.println("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("연산자[+, -, *, /] ? ");
		operator = sc.next().charAt(0);
		
		result = 0;
		switch(operator) {
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default: System.out.println("연산자 입력 오류 입니다.");
		}
		System.out.printf("%d %c %d = %d", a, b, operator, result);
		*/
		
		////////////////아래 -> 선생님 코드////////////////////

		Scanner sc = new Scanner(System.in);
		int a, b;
		String operator;
		
		System.out.println("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("연산자[+, -, *, /] ? ");
		operator = sc.next();
		
		switch(operator) {
		case "+": System.out.printf("%d + %d = %d\n", a, b, a+b); break;
		case "-": System.out.printf("%d - %d = %d\n", a, b, a-b); break;
		case "*": System.out.printf("%d * %d = %d\n", a, b, a*b); break;
		case "/": System.out.printf("%d / %d = %d\n", a, b, a/b); break;
		default: System.out.println("연산자 입력 오류 입니다.");
		}
	
		sc.close();
	}

}
