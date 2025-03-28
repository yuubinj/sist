package ch04.unit03;

public class Ex05_while {

	public static void main(String[] args) {
		
		/*
		int n, s;
		n = 0;
		s = 0;
		while(n < 10) {
			n++;
			s+=n; // 1+2+3+4+...+10
		}
		System.out.println("합: " + s); // 55
		System.out.println("n: " + n); // 10
		*/
		
		/*
		int n, s;
		n = s = 0;
		while(++n <= 10) {
			s += n; // 1+2+3+...+10
		}
		System.out.println("n: " + n + ", s: " + s); // 11, 55
		*/
		
		/*
		int n, s;
		n = s = 0;
		while(n++ < 10) {
			s += n; // 1+2+3+...+10
		}
		System.out.println("n: " + n + ", s: " + s); // 11, 55
		*/
		
		int n, s;
		n = s = 0;
		while(n++ <= 9) {
			s += n; // 1+2+3+...+10
		}
		System.out.println("n: " + n + ", s: " + s); // 11, 55
		
		
	}

}
