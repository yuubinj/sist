package ch04.unit03;

public class Quiz05 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		while(n < 100) {
			n += 2;
			s += n;
		}
		System.out.println("결과 : " + s);

	}

}
