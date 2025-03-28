package ch04.unit03.forEx2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, diff;
		int min = 0, closest = 0;

		System.out.println("5개의 숫자를 입력하세요...");
		for(int i=0; i<5; i++) {
			input = sc.nextInt();
			
			diff = (input > 7 ? input - 7 : 7 - input);
			if(i == 0 || min > diff) {
				min = diff;
				closest = input;
			}
		}
		
		System.out.println("7에 가장 가까운 수 : " + closest);
		sc.close();

	}

}
