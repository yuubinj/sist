package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_Date {

	public static void main(String[] args) {
		// 컴퓨터 시스템으로 Date 객체 생성
		Date date = new Date();
		System.out.println(date);
			// Thu Apr 03 09:05:50 GMT+09:00 2025

		// 1970.01.01 0:0:0.0 를 기준으로 밀리초 단위로 환산하여 반환
		long t = date.getTime();
		System.out.println(t);
		
		Date date2 = new Date(1743698885070L);
		System.out.println(date2);
		
		// SimpleDateFormat : Date <-> 문자열
		// Date 를 문자열로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);
		
		// 문자열을 Date 로 변환
		s ="2025-12-25";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			// 예외를 내포하고 있는 코드
			Date date3 = sdf2.parse(s);
			System.out.println(date3);
			
			// s = sdf.format(date3);
			s = sdf2.format(date3);
			System.out.println(s);
			
		} catch (Exception e) { // ParseException
			// 예외가 발생한 경우 실행할 코드
			e.printStackTrace();
		}
	}

}
