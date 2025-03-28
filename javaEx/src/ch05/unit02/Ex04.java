package ch05.unit02;

/*
 1  6 11 16
 2  7 12 17
 3  8 13 18
 4  9 14 19
 5 10 15 20
*/

public class Ex04 {

	public static void main(String[] args) {
		int[][] a = new int[5][4];
		int n = 0;

		for(int i=0; i<4; i++) { // 열
			for(int j=0; j<5; j++) { // 행
				n++;
				a[j][i] = n; 
			}
		}

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}

	}

}
