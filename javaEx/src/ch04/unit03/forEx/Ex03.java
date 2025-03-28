package ch04.unit03.forEx;

public class Ex03 {

	public static void main(String[] args) {
		
		// 처음 조건을 만족하지 않으면 단 한번도 실행하지 않는다.
		int n;
		for(n = 10; n <= 1; n--) {
			System.out.println("안 : " + n);
		}
		System.out.println("밖 : " + n); // 10

		// 10 9 8 7 6 5 4 3 2 1
		System.out.println("\n역으로 숫자 출력...");
		for(n = 10; n >= 1; n--) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("밖 : " + n); // 0
		
	}

}
