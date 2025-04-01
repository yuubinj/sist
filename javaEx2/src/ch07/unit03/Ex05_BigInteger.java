package ch07.unit03;

import java.math.BigInteger;

public class Ex05_BigInteger {

	public static void main(String[] args) {
		// 아주 큰 수
		BigInteger b1 = new BigInteger("123456789123456789");
		BigInteger b2 = new BigInteger("123456789123456789");
		BigInteger s;
		
		s = b1.add(b2); // 합
		System.out.println(s);
		
		s = b1.subtract(b2); // 차
		System.out.println(s);
		
		s = b1.multiply(b2); // 곱
		System.out.println(s);
		
		s = b1.divide(b2); // 몫
		System.out.println(s);

		s = b1.pow(3); // 3승
		System.out.println(s);
	}

}
