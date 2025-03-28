package ch04.unit02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1~3 사이의 수 ? ");
		n = sc.nextInt();
		
		switch(n) {
		case 3: System.out.print("#");
		case 2: System.out.print("#");
		case 1: System.out.print("#");
		}
		System.out.println();
		
		sc.close();

	}

}
