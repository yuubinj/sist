package ch04.unit02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("점수 ? ");
		n = sc.nextInt();

		var grade = switch(n/10) {
		case 9, 10 -> 4.0;
		case 8 -> 3.0;
		case 7 -> 2.0;
		case 6 -> 1.0;
		case 0,1,2,3,4,5 -> 0.0;
		default -> "점수 입력 에러";
		};
		
		System.out.printf("점수 : %d, 평점 : %s", n, grade);

		sc.close();
	}

}
