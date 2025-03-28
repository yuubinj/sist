package ch02.unit03;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {
		// 데이터를 입력 받을 수 있는 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		String name; 	// 문자열, "서울"
		int age; 		// 정수
		char gender;	// 문자, '한'
		double height;	// 실수
		
		System.out.print("이름 ? ");
		name = sc.next();
		// 문자열을 입력 받는다.
		// 공백이 구분 문자열이므로 공백은 입력할 수 없다.
			
		System.out.print("나이 ? ");
		age = sc.nextInt();

		System.out.print("성별(M/F) ? ");
		gender = sc.next().charAt(0);
			// 문자를 입력 받는 방법은 없다.
			// 따라서 문자열을 입력 받아 앞에 한글자를 가져온다.

		System.out.print("키 ? ");
		height = sc.nextDouble();
			// 실수 입력 받는다.
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		sc.close(); // Scanner 객체를 닫는다.
	}

}
