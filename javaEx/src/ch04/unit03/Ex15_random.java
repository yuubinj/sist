package ch04.unit03;

/*
 - 난수
 	: 정의된 범위 내에서 무작위로 추출된 수(복원추출)
 	: Math.random()
 	  Math.random() : 0 <= 난수 < 1 사이의 난수를 발생(실수)
 	  Math.random() * 100 : 0 <= 난수 < 100 사이의 난수를 발생(실수)
 */

public class Ex15_random {

	public static void main(String[] args) {
		// 1~100 까지 수 중 난수를 100개 발생하여 한 줄에 10개씩 출력
		int n, num;
		
		n = 0;
		while(n < 100) {
			n++;
			
			num = (int)(Math.random() * 100) + 1; // 1~100 사이의 난수
			System.out.print(num + "\t");
			if(n%10 == 0) {
				System.out.println();
			}
			
		}

	}

}
