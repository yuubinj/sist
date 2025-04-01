package ch07.unit03;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Ex06_BigDecimal {
	public static void main(String[] args) {
		// 아주 크거나 작은 실수
		BigDecimal b1 = new BigDecimal("123456789.123456789");
		BigDecimal b2 = new BigDecimal("34567.89");
		BigDecimal s;
		
		// s = b1.divide(b2); // 런타임 오류

		// 나머지, 반올림하지 않음
		s = b1.divide(b2, RoundingMode.DOWN);
		System.out.println(s);
		
		// 소수점 이하 3자리
		s = b1.divide(b2, 3, RoundingMode.DOWN);
		System.out.println(s);
		
		// BigInteger 로 변환
		BigInteger a = b1.toBigInteger();
		System.out.println(a);
		
	}

}
