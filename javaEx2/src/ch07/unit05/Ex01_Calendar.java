package ch07.unit05;

import java.util.Calendar;

/*
  - Calendar
  	: 날짜와 시간을 객체 모델링한 클래스
  	: 추상 클래스로 객체를 직접 생성할 수 없다.
  	: 추상 클래스는 미완성 클래스로 하위 클래스를 이용하여 객체를 생성한다.
  - 객체 생성 방법
  	1) Calendar now = Calendar.getInstance();
  	2) Calendar now = new GregorianCalendar();
  	   GregorianCalendar : Calendar 의 하위 클래스
  	3) GregorianCalendar now = new GregorianCalendar();
 */

public class Ex01_Calendar {

	public static void main(String[] args) {
		// 현재 시스템 날짜를 이용하여 Calendar 객체를 생성
		Calendar today = Calendar.getInstance();
		
		// %tF : 년-월-일, %tA : 요일. %tT : 시분초
		// String s = String.format("%tF %tA %tT", today, today, today);
		String s = String.format("%1$tF %1$tA %1$tT", today);
		System.out.println("오늘 날짜 및 시간 : " + s);
		
		int y = today.get(Calendar.YEAR); // 년도
		int m = today.get(Calendar.MONTH) + 1; // 월
			// today.get(Calendar.MONTH) 은 0(1월)~11(12월) 로 반환
		int d = today.get(Calendar.DATE); // 일
		// int d = today.get(Calendar.DAY_OF_MONTH); // 일
			// DATE 와 DAY_OF_MONTH는 동일
		int w = today.get(Calendar.DAY_OF_WEEK);
			//1:일, 2:월 ... 7:토
		int lastDay = today.getActualMaximum(Calendar.DATE);
			// 달의 마지막 일자
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		s = String.format("%d년 %d월 %d일 %s요일", y, m, d, week[w-1]);
		System.out.println(s);
		
		s = String.format("%d년 %d월의 마지막 날짜 : %d", y, m, lastDay);
		System.out.println(s);
		
		System.out.println("오전/오후 여부 : " + today.get(Calendar.AM_PM));
			// 오전:0, 오후:1
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("밀리초(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println();
		
		System.out.println("현재 요일이 이달의 몇번째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			// 2025-04-02(수):1 2025-04-09(수):2
		System.out.println("이번 달의 현재 주차 : " + today.get(Calendar.WEEK_OF_MONTH));
			// 1~6주차까지 반환
		System.out.println("올해의 현재 주차 : " + today.get(Calendar.WEEK_OF_YEAR));
	}

}
