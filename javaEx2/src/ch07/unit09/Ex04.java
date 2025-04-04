package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println("현재 : " + today);
		
		// 년도 변경
		LocalDateTime localDate2 = today.withYear(2026);
		// 월변경
		localDate2 = localDate2.withMonth(5);
		// 일변경
		localDate2 = localDate2.withDayOfMonth(5);
		System.out.println(localDate2);

		// 직접 변경
		LocalDateTime localDate3 = today
				.withYear(2025)
				.withMonth(6)
				.withDayOfMonth(10)
				.withHour(10)
				.withMinute(15)
				.withSecond(10);
		System.out.println("변경 후 : " + localDate3);
				
		// 상대 변경
		// 이번 해의 첫날
		localDate3 = today.with(TemporalAdjusters.firstDayOfYear());
		System.out.print("이번 해의 첫날 : " + localDate3);
		DayOfWeek week = today.getDayOfWeek();
		String w = week.toString();
		System.out.println(" / 요일은 : " + w);

		// 이번 해의 마지막 날
		localDate3 = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 날 : " + localDate3);
		
		// 다음 해의 첫날
		localDate3 = today.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫날 : " + localDate3);
		
		// 이번 달의 첫날
		localDate3 = today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫날 : " + localDate3);
		
		// 이번 달의 첫 월요일
		localDate3 = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일 : " + localDate3);
		
		// 돌아오는 월요일
		localDate3 = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + localDate3);

			// 만약에 오늘도 월요일이면, 다음주가 아니라 오늘이 나오도록. 
		localDate3 = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일(오늘 포함) : " + localDate3);
		
		// 지난 월요일
		localDate3 = today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + localDate3);
		
			// 만약에 오늘도 월요일이면, 저번주가 아니라 오늘이 나오도록. 
		localDate3 = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("지난 월요일(오늘 포함) : " + localDate3);
		
	}
}
