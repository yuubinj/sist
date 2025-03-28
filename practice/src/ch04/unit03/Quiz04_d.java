package ch04.unit03;

public class Quiz04_d {

	public static void main(String[] args) {
		int n, s, cnt;
		
		n = s = cnt = 0;
		while(n < 100) {
			n++;
			if(n%3==0 || n%5==0) {
				s += n;
				cnt ++;
			}
		}
		System.out.println("합 : " + s);
		System.out.println("평균 : " + s/cnt);

	}

}
