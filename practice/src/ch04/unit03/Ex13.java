package ch04.unit03;

public class Ex13 {

	public static void main(String[] args) {
		// 1~100 까지 수 중 홀수를 한 줄에 5개씩 출력하고 마지막에 합 출력
		
		int n, s, cnt;
		
		n = 1;
		s = 0;
		cnt = 0;
		while(n < 100) {
			cnt ++;
			s += n;
			System.out.print(n + (cnt%5==0 ? "\n" : "\t"));
			n += 2;
		}
		System.out.println("합 : " + s);

	}

}
