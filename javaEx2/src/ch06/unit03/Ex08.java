package ch06.unit03;

public class Ex08 {

	public static void main(String[] args) {
		Test8 t = new Test8();
		int n;
		
		n = t.number3();
		System.out.println("서로 다른 세자리 수 : " + n);
	}

}

class Test8{
	// 서로 다른 3가지 정수 : 102 ~ 987
	public int number3() {
		/*
		int n = 0;
		int a, b, c = 0;
		
		while(true) {
			n = (int)(Math.random() *900) + 100;
			a = n/100;
			b = (n - a*100)/10;
			c = (n - a*100 - b*10);
			
			if(a!=b && a!=c && b!=c) {
				return n;
			}			
		}
		*/
		
		int m1, m2, m3;
		
		m1 = (int)(Math.random() * 9) + 1; // 1~9 사이 정수
		do {
			m2 = (int)(Math.random() * 10); // 0~9 사이 정수
		} while(m1 == m2);
		
		do {
			m3 = (int)(Math.random() * 10); // 0~9 사이 정수
		} while(m1 == m3 || m2 == m3);
		
		return m1 * 100 + m2 *10 + m3;
	}
	
}