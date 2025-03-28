package ch04.unit03;

public class Quiz06 {

	public static void main(String[] args) {
		int n, s;
		
		n = 1;
		s = 0;
		while(n < 100) {
			s += n;
			n += 2;
		}
		System.out.println("결과 : " + s);

	}

}
