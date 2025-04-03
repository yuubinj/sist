package ch07.unit07;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01_NumberFormat {

	public static void main(String[] args) {
		String s;
		
		// 숫자 => 문자열
		int n = 12345;
		
		s = Integer.toString(n);
		System.out.println(s); // "12345"
		
		s = String.format("%,d", n);
		System.out.println(s); // "12,345"
		
		s = String.format("%.2f", 12345.56789);
		System.out.println(s); // "12345.57"
		
		s = String.format(Locale.ITALY, "%.2f", 12345.56789);
		System.out.println(s); // "12345,57"
		System.out.println();
		
		// 숫자에 대한 포멧
		NumberFormat nf = NumberFormat.getInstance();
		
		// 숫자 => 문자열로
		s = nf.format(12345);
		System.out.println(s); // "12,345"
		
		s = nf.format(12345.2567);
		System.out.println(s); // "12,345.257"
		// 기본 : 소수점 3자리까지만 + ,
		System.out.println();
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4); // 소수점 이하 최대 4자리
		nf2.setMinimumFractionDigits(2); // 소수점 이하 최소 2자리
		
		s = nf2.format(12345.456789);
		System.out.println(s); // "12,345.4568"
		
		s = nf2.format(12345);
		System.out.println(s); // "12,345.00"
		
		s = nf2.format(12345.7);
		System.out.println(s); // "12,345.70"
		
		// 통화에 대한 서식
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		s = nf3.format(12345);
		System.out.println(s); // ₩12,345
		
		// 국가별 설정을 미국으로
		// 한국 : Local.KOREA
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		s = nf4.format(12345);
		System.out.println(s); // $12,345.00
		
		// %에 대한 서식
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		s = nf5.format(0.23);
		System.out.println(s); // 23%
		
	}

}
