package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		// 2001.08.25 ~ 오늘까지 날 수 계산하기
		Date today = new Date();
		String birth = "2001-08-25";
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date birthDate = sdf.parse(birth);
			
			// 두 날짜 사이의 간격
			long dif = (today.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24); // 초 -> 분 -> 초 -> 며칠
			System.out.println("날 수 : " + dif);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
