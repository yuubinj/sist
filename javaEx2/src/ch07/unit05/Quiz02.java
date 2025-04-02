package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 생년월일을 입력 받아 나이 구하기
		// 생년월일은 2004-10-10, 2004.10.10, 2004/10/10 형식으로 입력 가능
		
		String birth;
		do {
			System.out.print("생년월일 ? ");
			birth = sc.next();
			
			birth = birth.replaceAll("(\\-|\\.|\\/)", "");
		} while(! birth.matches("^\\d{8}$"));
		
		int a = toAge(birth);
		System.out.println("나이는 " + a + "입니다.");
		
		sc.close();
	}
	
	public static int toAge(String birth) {
		int age = 0;
		
		/*
		int y = Integer.parseInt(birth.substring(0, 4));
		int m = Integer.parseInt(birth.substring(4, 6)) - 1;
		int d = Integer.parseInt(birth.substring(6));
		
		Calendar cal = Calendar.getInstance();
		age = cal.get(Calendar.YEAR) - y;
		if(m > cal.get(Calendar.MONTH) || (m == cal.get(Calendar.MONTH) && d > cal.get(Calendar.DAY_OF_MONTH))) {
			age --;
		}
		*/
		
		Calendar cal = Calendar.getInstance();
		int ty = cal.get(Calendar.YEAR);
		int tm = cal.get(Calendar.MONTH) + 1;
		int td = cal.get(Calendar.DATE);
		
		int y = Integer.parseInt(birth.substring(0, 4));
		int m = Integer.parseInt(birth.substring(4, 6));
		int d = Integer.parseInt(birth.substring(6));

		age = ty - y;
		if(m > tm || (m == tm && d > td)) {
			age --;
		}
		
		return age;
	}
	
	public static int toAge2(String birth) {
		int age = 0;
		birth = birth.replaceAll("(\\-|\\.|\\/)", "");
		
		Calendar today = Calendar.getInstance();
		String todayMonthDate = String.format("%02d%02d",
				today.get(Calendar.MONTH)+1, today.get(Calendar.DATE));
		
		int y = Integer.parseInt(birth.substring(0,4));
		age = today.get(Calendar.YEAR) - y;
		
		if(birth.substring(4).compareTo(todayMonthDate) > 0) {
			age --;
		}
		
		return age;
	}

}
