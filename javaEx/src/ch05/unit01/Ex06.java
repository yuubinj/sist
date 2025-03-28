package ch05.unit01;

public class Ex06 {

	public static void main(String[] args) {
		// 1~100 까지 수 중 서로 다른 난수 10개 발생

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		for (int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
