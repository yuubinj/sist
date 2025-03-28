package ch05.unit02;

public class Quiz04 {

	public static void main(String[] args) {
		int [][]num = new int[5][5];
		int n = 0;
		
		for(int i=0; i<5; i++) { // 행
			for(int j=i; j<5; j++) { // 열
				num[i][j] = ++n;
			}
		}

		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j] == 0) {
					System.out.print("   ");
				} else {
					System.out.printf("%3d", num[i][j]);					
				}
			}
			System.out.println();
		}

	}

}
