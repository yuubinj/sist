package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+' : System.out.printf("%d + %d = %d", a, b, a+b); break;
		case '-' : System.out.printf("%d - %d = %d", a, b, a-b); break;
		case '*' : System.out.printf("%d * %d = %d", a, b, a*b); break;
		case '/' : System.out.printf("%d / %d = %d", a, b, a/b); break;
		default: System.out.println("연산자 입력 오류입니다.");
		}
		sc.close();

	}

}
