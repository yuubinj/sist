package ch04.unit03;

public class Ex05 {

	public static void main(String[] args) {
		/*
		int n, s;
		
		n = s = 0;
		while(n < 10) {
			n ++;
			s += n;
		}
		System.out.println("while 밖 n : " + n); // 10
		System.out.println("합 : " + s); // 55
		*/
		
		/*
		int n, s;
		
		n = s = 0;
		while(n++ < 10) {
			s += n;
		}
		System.out.println("while 밖 n : " + n); // 11
		System.out.println("합 : " + s); // 55
		*/
		
		
		int n, s;
		
		n = s = 0;
		while(++n <= 10) {
			s += n;
		}
		System.out.println("while 밖 n : " + n); // 11
		System.out.println("합 : " + s); // 45
		
	}

}
