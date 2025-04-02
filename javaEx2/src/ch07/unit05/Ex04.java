package ch07.unit05;

import java.util.Calendar;

public class Ex04 {

	public static void main(String[] args) {
		// 주의 시작과 주의 마지막 날짜 구하기
		// 2025년 4월 29일이 있는 주의 일요일과 토요일 구하기
		
		Calendar cal = Calendar.getInstance();
		cal.set(2025, 4-1, 29);
		cal.getTime(); // 실제 시간이 변경됨
		
		System.out.printf("%tF %tA\n", cal, cal);
		
		// 날짜 복제(새로운 객체를 만들어 필드값만 같게)
		Calendar sday = (Calendar)cal.clone(); // 복제
			// 필드값은 동일하지만 새로운 객체를 생성함
		Calendar eday = (Calendar)cal.clone();
		
		// 일요일로 설정
		sday.set(Calendar.DAY_OF_WEEK, 1);
		// 토요일로 설정
		eday.set(Calendar.DAY_OF_WEEK, 7);
		
		System.out.printf("주시작일 : %tF %tA\n", sday, sday);
		System.out.printf("주마지막일 : %tF %tA\n", eday, eday);

	}

}
