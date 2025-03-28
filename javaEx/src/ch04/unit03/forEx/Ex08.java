package ch04.unit03.forEx;

public class Ex08 {

	public static void main(String[] args) {
		// 1~100 까지 수 중 3의 배수를 한 줄에 5개씩 출력하고 마지막에 합, 평균 출력

		int s = 0, cnt = 0;
		for(int n = 3; n <= 100; n+=3) {
			s += n;
			
			System.out.printf("%5d", n);
			cnt ++;
			if(cnt%5==0) {
				System.out.println();
			}
		}
		
		System.out.println("합 : " + s);
		System.out.println("평균 : " + (s/cnt));

	}

}
