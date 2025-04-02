package ch07.unit05;

import java.util.Calendar;

public class Ex03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2025, 5-1, 13); // 2025/05/13 -> 화요일
		System.out.printf("%tF %tA\n", cal, cal); // 2025-05-13 화요일
		
		// 오늘 : 2025-04-02
		// 요일을 일요일로 변경
		cal.set(Calendar.DAY_OF_WEEK, 1);
			// 현재 시스템 날짜가 있는 주차의 일요일로 변경
			// 2025년 4월 2일은 1주차이므로
			// 2025년 5월의 1주차 일요일을 반환
			// 이상한 현상이 발생 : 실제 날짜가 변경되지 않아서 일어나는 현상
		System.out.printf("%tF %tA\n", cal, cal); // 2025-04-27 일요일
		System.out.println("-----------------------------");
		
		/*
		  - set() 메소드는 Calendar의 필드값은 변경되지만
		  	Calendar의 실제 시간값은 변경되지 않아서 일어나는 현상
		  - get(), getTime(), add() 등의 메소드를 호출해야 set() 으로
		    변경된 실제 시간값이 변경된다.
		  - set()을 할때마다 시간값을 변경하는 것은 비효율적이므로
		  	불필요한 계산을 트리거하지 않는다.
		 */
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2025, 5-1, 13);
		System.out.printf("%tF %tA\n", cal2, cal2); // 2025-05-13 화요일
		
		cal2.getTime(); // Date 반환
			// 실제 시간값이 변경되어 아래의 결과는 정확한 결과가 출력 
		
		cal2.set(Calendar.DAY_OF_WEEK, 1);
		System.out.printf("%tF %tA\n", cal2, cal2); // 2025-05-11 일요일
		
	}

}
