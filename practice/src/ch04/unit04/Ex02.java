package ch04.unit04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 실수를 입력 받아 입력 받은 실수의 합 구하기
		// 단, 입력한 수가 0 이하 이면 합을 출력하고 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		double n, s;
		
		System.out.print("합을 구할 실수 입력[0이하는 종료] ? ");
		s = 0;
		while(true) {
			n = sc.nextDouble();
			
			if(n<=0) {
				break;
			}
			s += n;
		}
		System.out.println("합 : " + s);

		sc.close();
	}

}
