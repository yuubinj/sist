package ch04.unit03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int num, s, n;
		
		System.out.print("정수 ? ");
		num = sc.nextInt();
		
		if(num >= 0) {
			s = n = 0;
			
			while(n < num) {
				n++;
				s+=n;
			}
			System.out.println("1~"+num+" 까지 합 : " + s);
			
		} else {
			System.out.println("0 이상만 가능합니다.");
		}
		
		sc.close();
	}

}
