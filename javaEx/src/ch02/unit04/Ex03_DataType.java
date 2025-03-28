package ch02.unit04;

public class Ex03_DataType {

	public static void main(String[] args) {
		
		//byte b1 = 129; // 컴파일 오류. -128 ~ 127
		byte b1 = (byte) 129; // -127, overflow
		byte b2 = (byte) 385; // -127, overflow
		
		System.out.println(b1 + ", " + b2);
		System.out.println(b1 == b2);
		
		short a = 350;
		short b = -350;
		System.out.printf("%X %X\n", a, b); // 15E FEA2
		System.out.printf("%04X %04X\n", a, b);
				// 015E FEA2
				// 컴퓨터에서는 2진수로 저장되어
				// 015E : 0000 0001 0101 1110 => 350
				// FEA2 : 1111 1110 1010 0010 => -350
		

	}

}
