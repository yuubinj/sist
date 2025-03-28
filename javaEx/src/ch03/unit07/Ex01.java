package ch03.unit07;

public class Ex01 {

	public static void main(String[] args) {
		int a = 5, b = 3;
		
		double c = a / b; // 연산결과가 자동으로 double로 형변환
		System.out.println(c); // 1.0
		
		c = (double)a / b; // 강제 형변환
		System.out.println(c); // 1.666
		
		byte x = 10;
		short y = 20;
		
		// x = 20; // 가능
		// x = y; // 컴파일 오류
		x = (byte)y;
		System.out.println(x);
		
		y = 200;
		x = (byte)y; // 강제 형변환은 가능하지만 overflow가 발생
		System.out.println(x); // -56
		
		// int < float
		float bb;
		bb = -1; // 가능한 이유: int(작은 데이터)형을 float(큰 데이터)형에 넣을 때 문제가 없기 때문.
		System.out.println(bb);
		
		float f;
		//f = 13e3; // 컴파일 오류. 13e3은 double 형
		f = 13e3f;
		System.out.println(f);
	}

}
