package ch13.unit03;

import java.util.concurrent.TimeUnit;

public class Ex03 {

	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			
			TimeUnit.SECONDS.sleep(1L); // 1초
			TimeUnit.MILLISECONDS.sleep(1000L); // 1000ms -> 1초
			TimeUnit.MICROSECONDS.sleep(1000000L); // 1초
			TimeUnit.NANOSECONDS.sleep(1000000000L); // 1초
			
			long end = System.currentTimeMillis();
			System.out.println("sleep : " + (end - start) + "ms");
		
		} catch (Exception e) {
		}

		
	}

}
