package ch04.unit03.forEx;

public class Quiz08 {

	public static void main(String[] args) {

		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i + j == 9) {
					System.out.printf("[%d, %d]\n", i, j);
				}
			}
		}

	}

}
