package ch02.unit04;

public class Ex05_Precision {

	public static void main(String[] args) {
		
		// 정밀도
		int i1 = 2_000_000_000;
		int i2 = 2_000_000_050;
		
		float f1 = 2_000_000_000;
		float f2 = 2_000_000_050;

		double d1 = 2_000_000_000;
		double d2 = 2_000_000_050;
		
		System.out.printf("int : %d %d\n", i1, i2);
		System.out.printf("float : %.2f %.2f\n", f1, f2); // f1과 f2가 똑같이 나옴. => float은 정밀도가 떨어짐.
		System.out.printf("double : %.2f %.2f\n", d1, d2);

	}

}
