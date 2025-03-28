package ch04.unit03.forEx;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		int s, n;
		s = n = 0;
		while(n < 10) {
			n ++;
			s += n;
		}
		System.out.println("결과 : " + s);
		*/
		
		int s = 0;
		for(int n = 1; n <= 10; n++) {
			s += n;
		}
		System.out.println("결과 : " + s);

	}

}
