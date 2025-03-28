package ch04.unit03.forEx2;

public class Quiz05 {

	public static void main(String[] args) {
		
		/* -- 내가 푼 것
		int cnt = 0;
		
		gogo:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					continue gogo;
				}
			}
			System.out.printf("%4d", i);
			cnt ++;
			if(cnt%10==0) {
				System.out.println();
			}
		}
		System.out.println("\n소수의 개수 : " + cnt);
		*/
		
		/* -- 제곱근으로 구한 것
		int cnt = 0;
		
		gogo:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=(int)Math.sqrt(i); j++) {
				if(i%j == 0) {
					continue gogo;
				}
			}
			
			System.out.printf("%4d", i);
			cnt ++;
			if(cnt%10==0) {
				System.out.println();
			}
		}
		System.out.println("\n소수의 개수 : " + cnt);
		*/
		
		// boolean, break 로 해결
		int cnt = 0;
		boolean b;
		
		for(int i=2; i<=100; i++) {
			b = false;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					b = true;
					break;
				}
			}
			
			if(!b) { // if(b == false)
				System.out.printf("%4d", i);
				if(++cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n소수의 개수 : " + cnt);
	}

}
