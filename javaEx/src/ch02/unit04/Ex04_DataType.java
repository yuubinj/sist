package ch02.unit04;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		//        char  < int < long < float < double
		
		// float : 단정도형 실수
		float f1 = 0; // int 리터널을 float 자료형에 대입
		//float f2 = 0.5; // 컴파일 오류. 0.5 또는 0.0는 double 리터널
		float f2 = 0.5f; // 0.5f : 단정도형 실수
		float f3 = 1.2e04f; // 1.2 * 10의 4승
		// float형은 무조건 뒤에 f를 붙여야 함.
		float f4;
		f4 = 'A';
		System.out.println(f1 + ", " + f2 + ", " + f3 + ", " + f4);
		
		// double : 배정도형 실수
		double d1 = 0.5; // 0.5 : 배정도형 리터널
		double d2 = 3.14D; // 3.14d 와 동일, 배정도형 리터널
		double d3 = 1.2e-04;
		System.out.println(d1 + ", " + d2 + ", " + d3);
		
		f4 = (float)d2; // double 를 float 으로 형 변환
		System.out.println(f4);
	}

}
