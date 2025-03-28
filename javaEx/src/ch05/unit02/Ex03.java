package ch05.unit02;

/*
   1  2  3  4
   5  6  7  8
   9 10 11 12
  13 14 15 16
  17 18 19 20
 */

public class Ex03 {

	public static void main(String[] args) {
		int[][] a = new int[5][4];
		int n = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = ++n;				
			}
		}
		
		/*
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);				
			}
			System.out.println();
		}
		*/
		
		// 향상된 for 문으로 출력
		for(int []x : a) {
			for(int y : x) {
				System.out.printf("%3d", y);
			}
			System.out.println();
		}
	}

}
