package ch07.unit05_practice;

import java.util.Calendar;
import java.util.Scanner;

public class Ddi {
	
	static String []ddi = {"원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양"};
	
	public static void main(String[] args) {
		// 생년월일을 입력 받아 띠 구하기
		// 생년월일은 2004-10-10, 2004.10.10, 2004/10/10 형식으로 입력 가능
		Scanner sc = new Scanner(System.in);
		String birth;
		
		do {
			System.out.print("생년월일 ? ");
			birth = sc.next();
			
			birth = birth.replaceAll("(\\-|\\.|\\/)", "");
		} while(! birth.matches("^\\d{8}$"));
		
		String userDdi = toDdi(birth);
		System.out.println("당신은 " + userDdi + "띠 입니다.");
		todayDdi(userDdi);
		
		
		sc.close();

	}

	public static String toDdi(String birth) {
		int y;
		String result = null;
		
		y = Integer.parseInt(birth.substring(0, 4));
		
		try {
			result = ddi[y % 12];
		} catch (Exception e) {
			System.out.println("생년월일 입력 오류입니다.");
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static String todayDdi(String userDdi) {
		String result = null;
		int y;
		int count;
		
		Calendar today = Calendar.getInstance();
		y = today.get(Calendar.YEAR);
		
		try {
			result = ddi[y % 12];
		} catch (Exception e) {
			System.out.println("생년월일 입력 오류입니다.");
			e.printStackTrace();
		}
		
		if(userDdi.equals(result)) {
			System.out.println("올해는 당신의 띠의 해입니다!");
		} else {
			for(int i=0; i<ddi.length; i++) {
				if(userDdi.equals(ddi[i])) {
					System.out.println(userDdi + "띠 해는 " +
							((count = i - y%12) > 0 ? count + "년 후 입니다." : -count + "년 전 입니다."));
				}
			}
		}
		
		return result;
	}
}