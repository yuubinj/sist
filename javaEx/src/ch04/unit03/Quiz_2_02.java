package ch04.unit03;

public class Quiz_2_02 {

	public static void main(String[] args) {
		int n, s;
		
		n = 0;
		s = 0;
		/*
		while(n < 10) {
			n++;
			if(n % 2 == 0) {
				s -= n;
			} else {
				s += n;
			}
		}
		*/
		
		/*
		while(n < 10) {
			n++;
			s += n;
			n++;
			s -= n;	
		}
		*/
		
		while(n < 10) {
			n++;
			s = n%2 == 0 ? s-n : s+n;
		}
		
		System.out.println("결과 : " + s);

	}

}
