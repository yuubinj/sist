package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex06 {

	public static void main(String[] args) {
		// 문자열 <-> LocalDate
		
		DateTimeFormatter dtf;
		LocalDate localDate;
		String s;
		
		// 문자열 => LocalDate
		localDate = LocalDate.parse("2025-05-05");
		System.out.println(localDate);
		
		// localDate = LocalDate.parse("2025/05/05"); // 런타임 오류
		
		// Formatter
		dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2025-05-05", dtf);
		System.out.println(localDate);

		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2025/05/05", dtf);
		System.out.println(localDate);
		
		dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2025.05.05", dtf);
		System.out.println(localDate);
		System.out.println();
		
		// LocalDate -> 문자열 ---
		localDate = LocalDate.now();
		s = localDate.toString();
		System.out.println(s); // yyyy-MM-dd
		
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		s = localDate.format(dtf);
		System.out.println(s);
		
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		s = localDate.format(dtf);
		System.out.println(s);
		
		LocalDateTime ldt = LocalDateTime.now();
		dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		s = ldt.format(dtf);
		System.out.println(s);
	}

}
