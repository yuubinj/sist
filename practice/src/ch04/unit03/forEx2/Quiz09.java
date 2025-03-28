package ch04.unit03.forEx2;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String s;
		
		while(true) {
			do {
				System.out.print("1.가위 2.바위 3.보 4.종료 => ");
				user = sc.nextInt();
			} while(user < 1 || user > 4);
			
			if (user == 4) {
				System.out.println("프로그램 종료합니다...");
				break;
			}
			
			com = (int)(Math.random() * 3) + 1;
			
			s = (user ==1? "가위" : (user ==2 ? "바위" : "보"));
			System.out.println("당신 : " + s);
			s = (com ==1? "가위" : (com ==2 ? "바위" : "보"));
			System.out.println("컴퓨터 : " + s);
			
			// 1:3 2:1 3:2
			if(user == com) {
				System.out.println("비겼습니다.");
			} else if(user-com==-2 || user-com==1) {
				System.out.println("당신이 이겼습니다.");
			} else {
				System.out.println("당신이 졌습니다.");
			}
			System.out.println();
		}
		sc.close();

	}

}
