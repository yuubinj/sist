package ch04.unit03.forEx;

public class Quiz04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}

	}

}
