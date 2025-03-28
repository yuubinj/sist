package ch04.unit03.forEx;

public class Quiz09 {

	public static void main(String[] args) {
		
		/* - 잘못된 답
		int s = 0;
		for(int i=1; i<=100; i++) {
			s += i;
			if(i%10 == 0) {
				System.out.printf("1 ~ %d 까지 합 : %s\n", i, s);
			}
		}
		*/
		
		int s = 0;
		for(int i=1; i<=100; i++) {
			s += i;
			if(i%10 == 0) {
				System.out.printf("%d ~ %d 까지 합 : %s\n", i-9, i, s);
				s = 0; // s 변수의 생명주기
			}
		}
		
	}

}
