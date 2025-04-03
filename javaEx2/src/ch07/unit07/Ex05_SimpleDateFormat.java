package ch07.unit07;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		// SimpleDateFormat : 문자 <-> 날짜(Date)
		String s1,s2;
		long result;

		s1 = "2025-03-02 10:10:02";
		s2 = "2025-03-10 12:10:20";
		result = diffOfHours(s1, s2);
		System.out.println(s1 + " ~ " + s2 + " 사이의 시간 차이 : " + result);

		
		s1 = "2025-03-02";
		s2 = "2025-10-10";
		result = diffOfDays(s1, s2);
		System.out.println(s1 + " ~ " + s2 + " 사이의 일수 차이 : " + result);
		
	}
	
	// 두 날짜 사이의 간격을 시간으로(날짜형식 : yyyy-MM-dd HH:mm:ss)
	public static long diffOfHours(String begin, String end) {
		long result = 0L;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date beginTime = sdf.parse(begin);
			Date endTime = sdf.parse(end);
			
			result = (endTime.getTime() - beginTime.getTime()) / (1000 * 60 * 60);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}	
		
		return result;
	}

	// 두 날짜 사이의 간격을 일자로(날짜형식 : yyyy-MM-dd)
	public static long diffOfDays(String begin, String end) {
		long result = 0L;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginDate = sdf.parse(begin);
			Date endDate = sdf.parse(end);
			
			result = (endDate.getTime() - beginDate.getTime()) / (1000 * 60 * 60 * 24);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return result;
	}
	
}
