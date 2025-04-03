package ch07.unit05;

import com.util.DateUtil;

public class Ex09 {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		String s;
		
		s = "2025-04-30";
		System.out.println(util.isValidDate(s)); // true
		System.out.println(util.isValidDate2(s)); // true

		s = "2025-04-32";
		System.out.println(util.isValidDate(s)); // false
		System.out.println(util.isValidDate2(s)); // false
		
		/* 내가 짠 것
		s = "2025-04-03";
		if(util.isValidDate2(s)) {
			System.out.println(util.toDayOfWeek(s));			
		}
		*/
		
		s = "2025-04-03";
		System.out.println(util.toDate(s)); // Thu Apr 03 00:00:00 GMT+09:00 2025
		System.out.println(util.toDayOfWeek(s)); // 목

	}

}
