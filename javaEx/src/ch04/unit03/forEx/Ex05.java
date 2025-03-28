package ch04.unit03.forEx;

public class Ex05 {

	public static void main(String[] args) {
		int s, n;
		
		s = 0;
		for(n = 1; n <= 10; n++) {
			s += n;
			System.out.print(n + "," + s + "  ");
			// 1,1  2,3  3,6  4,10  5,15  6,21  7,28  8,36  9,45  10,55
		}
		System.out.println("\n 밖 n : " + n + ", s : " + s); // 11, 55
		System.out.println();
		
		// for 안에서 변수 선언
		int s2 = 0;
		for(int a = 1; a <= 10; a++) {
			s2 += a;
		}
		System.out.println("결과 : " + s2);
		System.out.println();
		
		
	}

}
