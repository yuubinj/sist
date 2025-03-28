package ch04.unit03;

public class Quiz08_d {

	public static void main(String[] args) {
		int n, s, cnt;
		
		n = 1; 
		s = cnt = 0;
		while(cnt < 20) {
			n += cnt;
			s += n;
			cnt ++;
		}
		System.out.println("결과 : " + s);

	}

}
