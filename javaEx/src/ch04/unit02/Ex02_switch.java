package ch04.unit02;

import java.util.Scanner;

public class Ex02_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1~3 사이의 수 ? ");
		n = sc.nextInt();
		
		switch(n) {
		case 3: System.out.print("*");
				System.out.print('#');
				System.out.print('@');
				break; // switch ~ case를 빠져 나감
		case 2: System.out.print("*");
				System.out.print('#');
				break;
		case 1: System.out.print("*");
				break; // 마지막은 생략 가능
		}
		System.out.println();
		
		sc.close();

		
	}

}
