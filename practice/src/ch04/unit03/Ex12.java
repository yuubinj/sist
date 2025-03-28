package ch04.unit03;

public class Ex12 {

	public static void main(String[] args) {
		// 1~100까지 합을 수가 10의 배수가 될 때마다 출력
		int n, s;
		
		n = s = 0;
		while(n < 100) {
			n ++;
			s += n;
			if(n % 10 == 0) {
				System.out.printf("1~%d까지 합 : %d\n", n, s);
			}
		}

	}

}
