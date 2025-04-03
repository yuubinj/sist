package ch07.unit09;

import java.time.LocalDateTime;

public class Ex03 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 : " + now);
		
		LocalDateTime target = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("연산 후 : " + target);
	}
}
