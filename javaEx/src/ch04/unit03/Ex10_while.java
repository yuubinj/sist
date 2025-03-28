package ch04.unit03;

public class Ex10_while {

	public static void main(String[] args) {
		// 1/2 + 2/3 + 3/4 + ... + 9/10의 결과
		/*
		double n, s;
		
		n = 0;
		s = 0;
		while(n < 9) {
			n++;
			s += n/(n+1); 
		}
		System.out.println("결과 : " + s);
		*/
		
		int n;
		double s;
		
		n = 0;
		s = 0;
		while(n < 9) {
			n++;
			s += (double)n/(n+1);
		}
		System.out.println("결과 : " + s);
	}

}
