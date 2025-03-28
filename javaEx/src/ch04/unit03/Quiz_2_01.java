package ch04.unit03;

import java.util.Scanner;

public class Quiz_2_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("수 ? ");
		input = sc.nextInt();
		
		int n;
		int s, o, e;
		
		n = 0; 
		s = o = e = 0;
		
		while(n < input) {
			n++;
			s+=n;
			if(n%2==0) {
				e += n;
			} else {
				o += n;
			}
		}
		
		System.out.println("합 : " + s);
		System.out.println("짝수 합 : " + e);
		System.out.println("홀수 합 : " + o);
		
		sc.close();

	}

}
