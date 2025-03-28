package ch03.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//섭씨 온도
		int cel;
		System.out.print("섭씨 온도 ? ");
		cel = sc.nextInt();
		
		//화씨 온도
		double fah;
		fah = cel * 1.8 + 32;
		
		System.out.printf("화씨온도 : %.1f", fah);
		
		sc.close();

	}

}
