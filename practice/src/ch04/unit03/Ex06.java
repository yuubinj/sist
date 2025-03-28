package ch04.unit03;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		int n, s;
		
		n = 0;
		s = 0;
		while(n < 100) {
			n += 2;
			s += n;
		}
		System.out.println("합 : " + s); // 2550
		*/
		
		int n, s;
		
		n = 1;
		s = 0;
		while(n < 100) {
			s += n;
			n += 2;
		}
		System.out.println("합 : " + s); // 2500
		
		
	}

}
