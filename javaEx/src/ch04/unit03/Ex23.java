package ch04.unit03;

public class Ex23 {

	public static void main(String[] args) {
		int a, b;
		
		a = 1;
		while(a < 9) { // 8번 반복 // 단
			a++;
			System.out.println("** " + a + "단 **");
			
			b = 0; // 루프 밖에 있으면 결과값이 다르게 나옴. 초기값을 어디에 주느냐가 중요.
			while(b < 9) { // 곱하는 수
				b++;
				System.out.printf("%d * %d = %d\n", a, b, a*b); // 72번 반복
			}
			System.out.println("-------------");
		}

	}

}
