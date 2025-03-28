package ch04.unit03;

public class Quiz_2_10 {

	public static void main(String[] args) {
		int a, b;

		a = 0;
		while (a < 9) { // 곱하는 수
			a++;
			b = 1;
			while (b < 9) { // 단
				b++;
				System.out.printf("%d * %d = %2d\t", b, a, a * b);
			}
			System.out.println();
		}

	}

}
