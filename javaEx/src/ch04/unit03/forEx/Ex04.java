package ch04.unit03.forEx;

public class Ex04 {

	public static void main(String[] args) {
		int n;
		
		// 짝수
		for(n = 2; n <= 10; n+=2) {
			System.out.print(n + " "); // 2 4 6 8 10
		}
		System.out.println("\n밖 : " + n); // 12
		System.out.println();

		// 홀수
		for(n = 1; n <= 10; n+=2) {
			System.out.print(n + " "); // 1 3 5 7 9
		}
		System.out.println("\n밖 : " + n); // 11
		System.out.println();


	}

}
