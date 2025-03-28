package ch04.unit03;

public class Ex20 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		do {
			n ++;
			s += n;
		} while(n < 10);
		System.out.println("합 : " + s);

	}

}
