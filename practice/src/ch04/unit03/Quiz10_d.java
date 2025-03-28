package ch04.unit03;

public class Quiz10_d {

	public static void main(String[] args) {
		int n, dan;
		
		n = 0;
		while(n < 9) {
			n++;
			dan = 1;
			while(dan < 9) {
				dan++;
				System.out.printf("%d * %d = %d\t", dan, n, dan*n);
			}
			System.out.println();
		}

	}

}
