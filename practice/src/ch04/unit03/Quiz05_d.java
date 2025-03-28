package ch04.unit03;

public class Quiz05_d {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		while(s <= 100) {
			n ++;
			s += n;
		}
		System.out.println("최소의 n : " + n);
		System.out.println("합 : " + s);

	}

}
