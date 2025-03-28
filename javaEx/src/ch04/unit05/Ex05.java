package ch04.unit05;

public class Ex05 {

	public static void main(String[] args) {
		int cnt = 0;
		
		// 소수를 한 줄에 10개씩 출력
		gogo:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=i/2; j++) { // 실제는 제곱근까지만 나누어보면 된다.
				if(i%j == 0) {
					continue gogo;
				}
			}
			System.out.printf("%4d", i);
			if(++cnt % 10 == 0) {
				System.out.println();
			}
		}

	}

}
