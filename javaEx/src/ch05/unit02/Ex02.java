package ch05.unit02;

public class Ex02 {

	public static void main(String[] args) {
		int [][] a = new int[3][]; // 행수만 지정
		
		// 배열의 배열
		// 열의 수를 각각 다르게 지정
		a[0] = new int[4];
		a[1] = new int[3];
		a[2] = new int[5];
		
		System.out.println("배열 행수 : " + a.length); // 3
		System.out.println("0행의 열수 : " + a[0].length); // 4
		System.out.println("1행의 열수 : " + a[1].length); // 3
		System.out.println("2행의 열수 : " + a[2].length); // 5

	}

}
