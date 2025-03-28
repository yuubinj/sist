package ch04.unit03;

public class Ex06_while {

	public static void main(String[] args) {
		
		// 1~100까지 짝수합
		/*
		int s, n;
		s = 0;
		n = 0;
		while(n < 100) {
			n += 2;
			s += n; // 2+4+6+...+98+100
		}
		System.out.println("결과 : " + s); // 2550
		*/
		
		// 1~100 까지 홀수합
		int s, n;
		s = 0;
		n = 1;
		while(n < 100) {
			s += n; // 1+3+5+...+97+99
			n += 2;
		}
		System.out.println("결과 : " + s); // 2500
		
		/*
		// 최악의 코딩 - 속도가 매우 느림(불필요한 반복 + 나눗셈)
		int s, n;
		s = 0;
		n = 0;
		while(n < 100) {
			n++;
			if(n%2==1){
				s+= n;
			}
		}
		System.out.println("결과 : " + s);
		*/
		
	}

}
