package ch05.unit02;

public class Ex06 {

	public static void main(String[] args) {
		// 배열의 배열 초기화
		int [][]a = new int[][] {{10,20,30},{40,50},{70,80,90}};
		// int [][]a = {{10,20,30},{40,50},{70,80,90}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

}
