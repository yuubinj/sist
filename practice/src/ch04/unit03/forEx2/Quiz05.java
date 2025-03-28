package ch04.unit03.forEx2;

public class Quiz05 {

	public static void main(String[] args) {

		int cnt = 0;
		
		gogo:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=(int)Math.sqrt(i); j++) {
				if(i%j==0) {
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

	}

}
