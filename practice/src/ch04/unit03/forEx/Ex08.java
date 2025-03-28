package ch04.unit03.forEx;

public class Ex08 {

	public static void main(String[] args) {
		// 1~100 까지 수 중 3의 배수를 한 줄에 5개씩 출력하고 마지막에 합, 평균 출력
		
		int s, cnt;
		s = cnt = 0;
		
		for(int i=3; i<100; i+=3) {
			cnt++;
			s += i;
			System.out.print(i + "\t");
			if(cnt%5==0) {
				System.out.println();
			}
		}
		System.out.println("\n합 : " + s);
		System.out.println("평균 : " + s/cnt);

	}

}
