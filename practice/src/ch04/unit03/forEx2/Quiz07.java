package ch04.unit03.forEx2;

public class Quiz07 {

	public static void main(String[] args) {

		/*
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}

		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int j=6; j<=9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		*/
		
		for(int i=0; i<2; i++) {
			for(int j=1; j<=9; j++) {
				for(int k=i*4+2; k<=i*4+5; k++) {
					System.out.printf("%d * %d = %d\t", k, j, k*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
