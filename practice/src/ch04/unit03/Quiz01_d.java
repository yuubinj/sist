package ch04.unit03;

import java.util.Scanner;

public class Quiz01_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num, s, o, p;
		
		System.out.print("수 ? ");
		num = sc.nextInt();
		
		n = s = o = p = 0;
		while(n < num) {
			n ++;
			s += n;
			if(n % 2 == 0) {
				o += n;
			} else {
				p += n;
			}
		}
		System.out.println("합 : " + s);
		System.out.println("짝수 합 : " + o);
		System.out.println("홀수 합 : " + p);

		sc.close();
	}

}
