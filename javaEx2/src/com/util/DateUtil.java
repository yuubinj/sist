package com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 날짜형식이 올바른지 여부를 판별
	 * @param strDate	판별할 문자열의 날짜
	 * @return			형식이 올바른지의 여부(true/false)
	 */
	public boolean isValidDate(String strDate) {
		
		try {
			// 20051010, 2005.10.10, 2005/10/10, 2005-10-10
			if(strDate.length() != 8 && strDate.length() != 10) {
				return false;
			}
			
			strDate = strDate.replaceAll("(\\-|\\.|\\/)", "");
			
			if(strDate.length() != 8) {
				return false;
			}
			
			int y = Integer.parseInt(strDate.substring(0,4));
			int m = Integer.parseInt(strDate.substring(4,6));
			int d = Integer.parseInt(strDate.substring(6));
			
			Calendar cal = Calendar.getInstance();
			cal.set(y, m-1, d);
			
			int y1 = cal.get(Calendar.YEAR);
			int m1 = cal.get(Calendar.MONTH) + 1;
			int d1 = cal.get(Calendar.DATE);
			
			if(y != y1 || m != m1 || d != d1) {
				return false;
			}
			
			
		} catch (Exception e) {
			// 예외가 발생한 경우
			return false;
		}
		
		return true;
	}
	
	public boolean isValidDate2(String dateString) {
		String[] dateFormats = {
				"yyyyMMdd", "yyyy-MM-dd", "yyyy.MM.dd", "yyyy/MM/dd"};
		
		for(String format: dateFormats) {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			sdf.setLenient(false); // 엄격한 날짜 검사
				// 엄격한 날짜 검사에서는 2025-04-31은 false
			
			try {
				sdf.parse(dateString);
				
				return true;
			} catch (Exception e) { // ParseException
				// 예외가 발생하면 해당 형식은 유효하지 않음
			}
		}
		
		return false;
	}
	
	/**
	 * 문자열 형식의 날짜를 Date 형으로 변환하여 반환
	 * @param dateString	변환할 날짜
	 * @return				변환된 Date 객체
	 */
	public Date toDate(String dateString) {
		Date result = null;
		
		try {
			if(! isValidDate(dateString)) {
				// 날짜 형식이 잘못된 경우 예외 발생
				throw new RuntimeException("날짜 형식이 올바르지 않습니다.(" + dateString + ")");
			}
			
			dateString = dateString.replaceAll("(\\-|\\.|\\/)", "");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			result = sdf.parse(dateString);
		} catch (Exception e) {
			// 날짜 형식이 올바르지 않는 경우 예외 발생
			throw new RuntimeException(e);
		}
		
		return result;
	}
	
	/**
	 * 날짜에 대한 요일 항 구하는 메소드
	 * @param dateString	요일을 구할 날짜
	 * @return				요일(일, 월, ... 토)
	 */
	public String toDayOfWeek(String dateString) {
		String result = null;
		
		/*
		dateString = dateString.replaceAll("(\\-|\\.|\\/)", "");
		
		int y = Integer.parseInt(dateString.substring(0,4));
		int m = Integer.parseInt(dateString.substring(4,6));
		int d = Integer.parseInt(dateString.substring(6));
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d);
		
		String[] dayOfWeek = {"일", "월", "화", "수", "목", "금", "토"};
		result = dayOfWeek[cal.get(Calendar.DAY_OF_WEEK)-1];
		*/
		
		try {
			Date d = toDate(dateString);
			
			SimpleDateFormat sdf = new SimpleDateFormat("E"); // 'E'는 요일만 가지고 온다.
			result = sdf.format(d); // 일, 월, 화, ..., 토
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return result;
	}

}
