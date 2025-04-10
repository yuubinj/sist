package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil2 {
	
	public boolean isValidDate(String dateStr){
		try {
			if(dateStr.length() != 8 || dateStr.length() != 10) {
				return false;
			}
			
			dateStr = dateStr.replaceAll("(\\-|\\.|\\/)", "");
			
			String s;
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate localDate = LocalDate.parse(dateStr, formatter);
			
			s = localDate.format(formatter);
			if(dateStr.equals(s)) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}

}
