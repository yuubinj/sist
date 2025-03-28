package ch04.unit05;

public class Ex01_continue {
	public static void main(String[] args) {
		// 1~100까지 수 중 2 또는 3의 배수를 제외한 수의 합
		int n, s;
		n = s = 0;
		
		// continue : while, do~while, for 문에서 사용
		while(n<100) {
			n++;
			if(n%2==0 || n%3==0) {
				continue;
			}
			s += n;
		}
		
		/*
		// continue 를 쓰지 않을 때
		while(n<100) {
			n++;
			if(n%2!=0 && n%3!=0) {
				s += n;
			}
		}
		*/
		System.out.println("결과 : " + s);
	}

}
