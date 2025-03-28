package ch05.unit03;

public class Ex04 {

	public static void main(String[] args) {
		int [][]a = new int[][] {{10,20,30}, {40,50,60}};
		int [][]b = new int[2][3];
		// int [][]b = new int[a.length][a[0].length];
		
		// 배열의 배열에서 값을 복사하는 방법
		for(int i=0; i<a.length; i++) {
			System.arraycopy(a[i], 0, b[i], 0, a[i].length);
		}
		
		b[1][1] = 200;
		System.out.println(a[1][1] + " : " + b[1][1]); // 50 : 200

	}

}
