package ch04.unit03;

public class Quiz_2_04 {

	public static void main(String[] args) {
		/*
		int n, a, s, avg;
		
		n = a = s = avg = 0;
		while(n < 100) {
			n++;
			if(n % 3 == 0 || n % 5 == 0) {
				a++;
				s += n;
				avg = s / a;
			}
		}
		System.out.println("합 : " + s);
		System.out.println("평균 : " + avg);
		*/
		
		int n;
		int s, cnt;
		
		n = 0;
		s = 0;
		cnt = 0;
		
		while(n<100) {
			n++;
			if(n % 3 == 0 || n % 5 == 0) {
				s += n; // 합
				cnt++; // 개수
			}
		}
		System.out.println("합 : " + s);
		System.out.println("평균 : " + (s / cnt));

	}

}
