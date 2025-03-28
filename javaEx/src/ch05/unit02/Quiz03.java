package ch05.unit02;

public class Quiz03 {

	public static void main(String[] args) {
		int [][]num = new int[4][5];
		int n = 0;
		
		/*
		for(int i=0; i<5; i++) { // 열
			for(int j=0; j<4; j++) { // 행
				n++;
				if(i%2==0) {
					num[j][i] = n;
				} else {
					num[3-j][i] = n;
				}
			}
		}
		*/
		
		// if를 쓰기 싫다면
		int row;
		for(int i=0; i<5; i++) { // 열
			for(int j=0; j<4; j++) { // 행
				row = i%2==0? j: 3-j;
				num[row][i] = ++n;
			}
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.println();
		}

	}

}
