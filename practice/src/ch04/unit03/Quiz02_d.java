package ch04.unit03;

public class Quiz02_d {

	public static void main(String[] args) {
		int n, s;
		
		n = s =0;
		/*
		while(n < 10) {
			n ++;
			s += n;
			n ++;
			s -= n;
		}
		System.out.println("결과 : " + s);
		*/
		
		while(n < 10) {
			n ++;
			if(n%2==0) {
				s -= n;				
			} else {
				s += n;				
			}
		}
		System.out.println("결과 : " + s);
		
	}

}
