package ch04.unit03;

import java.util.Scanner;

public class Quiz06_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, t, s;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			t = a; a = b; b = t;
		}
		
		s = 0;
		t = a;
		while(a <= b) {
			s += a;
			a ++;
		}
		System.out.println(t + " ~ " + b + " 까지의 합 = " + s);
		
		sc.close();
	}

}
