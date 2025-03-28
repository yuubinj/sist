package ch04.unit01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String name;
		int a, b, c;
		
		System.out.print("이름 ? ");
		name = sc.next();
		System.out.print("세과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a+b+c)/3 >= 60) {
			if(a >= 40 && b >= 40 && c >= 40) {
				System.out.println(name + "님은 합격입니다.");
			} else {
				System.out.println(name + "님은 과락입니다.");
			}
		} else {
			System.out.println(name + "님은 불합격입니다.");
		}
		*/
		
		////////////////아래 -> 선생님 코드////////////////////

		Scanner sc = new Scanner(System.in);
		String name, result;
		int a, b, c;
		int tot, ave;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		tot = a + b + c;
		ave = tot / 3;
		
		if(a >= 40 && b >= 40 && c >= 40 && ave >= 60) {
			result = "합격";
		} else if(ave < 60){
			result = "불합격";
		} else {
			result = "과락";
		}
		
		System.out.printf("%s님은 %s 입니다.\n", name, result);

		sc.close();
	}

}
