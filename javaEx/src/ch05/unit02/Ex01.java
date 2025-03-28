package ch05.unit02;

public class Ex01 {

	public static void main(String[] args) {
		// 배열의 배열(2차원 배열)
		int [][]a = new int[3][4];
		
		System.out.println("행의 수 : " + a.length); // 3
		System.out.println("0행의 열수 : " + a[0].length); // 4
		
		System.out.println("배열의 참조 위치 : " + a);
		System.out.println("0행의 참조 위치 : " + a[0]);
		System.out.println("1행 2열의 값 : " + a[1][2]);
			// a[0][0] ~ a[2][3]

	}

}
