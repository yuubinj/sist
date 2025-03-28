package ch04.unit01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int h, salary;
		
		System.out.print("근무시간 ? ");
		h = sc.nextInt();
		
		salary = 0;
		if(h <= 8) {
			salary = h * 10000; 
		} else if(h > 8) {
			salary = (int)((8 * 10000) + (h-8)*1.5*10000);
		}
		System.out.printf("급여 : %,d원", salary);
		*/
		
		////////////////아래 -> 선생님 코드////////////////////

		Scanner sc = new Scanner(System.in);
		int h;
		int pay, rate = 10000;
		
		System.out.print("근무시간 ? ");
		h = sc.nextInt();
		
		if(h > 8) {
			pay = (8 * rate) + (int)((h-8) * rate * 1.5); 
		} else {
			pay = h * rate;
		}
		
		System.out.printf("급여 : %,d원\n", pay);

		sc.close();

	}

}
