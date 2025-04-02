package ch07.unit05;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 2026년 12월 25일로 날짜를 변경
		cal.set(2026, 12-1, 25);
		System.out.printf("%tF %tA\n", cal, cal);
		
		// 2026년 5월 33일로 날짜를 변경
		cal.set(2026, 5-1, 33); // 2026-06-02
		System.out.printf("%tF %tA\n", cal, cal);
		
		// 2023년 2월 30일로 날짜를 변경
		cal.set(Calendar.YEAR, 2023); // 2023-06-02
		cal.set(Calendar.MONTH, 2-1); // 2023-03-05
		cal.set(Calendar.DATE, 30); // 2023-03-02
		System.out.printf("%tF %tA\n", cal, cal);
		
		// 홍길동은 2025년 3월 20일에 여자친구를 만났다. 100일 후는 ?
		cal.set(2025, 3-1, 20);
		cal.add(Calendar.DATE, 100);
		System.out.printf("%tF %tA\n", cal, cal);

		// 2025년 4월 2일 기준. 나는 태어난지 8621일!
		cal.set(2001, 8-1, 25);
		cal.add(Calendar.DATE, 8621);
		System.out.printf("%tF %tA\n", cal, cal);

		
	}

}
