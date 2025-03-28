package ch05.unit02;

public class Quiz02 {

	public static void main(String[] args) {
		char [][]cc = new char[5][5];
		char c = 'A';
		
		for(int i=0; i<5; i++) { // 열
			for(int j=4; j>=0; j--) { // 행
				/*
				cc[j][i] = c;
				c += 1;
				*/
				cc[j][i] = c++;
			}
		}

		for(int i=0; i<cc.length; i++) {
			for(int j=0; j<cc[i].length; j++) {
				System.out.printf("%3c", cc[i][j]);
			}
			System.out.println();
		}
	}

}
