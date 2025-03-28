package ch05.unit02;

public class Quiz01 {

	public static void main(String[] args) {

		int [][] num = new int[5][5];
		int a = 0;
		
		/*
		for(int i=0; i<5; i++) {
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					num[i][j] = a;
					a++;
				}
			} else {
				for(int j=4; j>=0; j--) {
					num[i][j] = a;
					a++;
				}
			}
		}
		*/
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				a++;
				if(i%2==0) {
					num[i][j] = a;
				} else {
					num[i][4-j] = a;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.println();
		}

	}

}
