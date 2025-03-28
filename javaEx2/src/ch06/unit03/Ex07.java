package ch06.unit03;

public class Ex07 {
	public static void main(String[] args) {
		Test7 t = new Test7();
		
		System.out.println(t.tti(2025));
		
	}

}

class Test7{
	// 년도에 대한 띠 구하기
	public String tti(int year) {
		String [] ss = new String[] {"원숭이","닭","개","돼지",
				"쥐","소","호랑이","토끼","용","뱀","말","양"};
		
		return ss[year%12];
	}
	
	// 윤년 판단
	public boolean isLeapYear(int year) {
		return year%4==0 && year%100!=0 || year%400==0;
	}
	
	// 월의 마지막 날짜 구하기
	public int lastDayOfMonth(int year, int month) {
		int [] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		days[1] = isLeapYear(year) ? 29 : 28;
		
		return days[month - 1];
	}
	
	// 년도에 대한 각 월의 마지막 날짜
	public int[] lastDayOfMonth(int year) {
		int [] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		days[1] = isLeapYear(year) ? 29 : 28;
		
		return days;
	}
	
}
