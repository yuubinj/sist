package ch04.unit03;

public class Quiz08 {

	public static void main(String[] args) {
		int n, s;
		
		n = 0;
		s = 1;
		while(n < 10) {
			n ++;
			s *= n;
		}
		System.out.println("결과 : " + s);

	}

}
