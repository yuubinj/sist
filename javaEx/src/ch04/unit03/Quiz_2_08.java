package ch04.unit03;

public class Quiz_2_08 {

	public static void main(String[] args) {
		/*
		int n, s, cnt;
		
		n = s = cnt = 0;
		while(cnt < 20) {
			cnt++;
			n += cnt;
			s += n;
		}
		System.out.println("결과 : " + s);
		*/
		
		// 1 + 2 + 4 + 7 + 11 + ... : 20개
		int n = 0;
		int s = 0;
		int t = 1;
		
		while(n < 20) {
			//System.out.println(t);
			s += t;
			n++;
			t += n;
		}
		System.out.println("결과 : " + s);
	}

}
