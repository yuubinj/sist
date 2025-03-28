package ch05.unit01;

public class Ex07 {

	public static void main(String[] args) {
		// 1~10 까지 난수를 100개 발생하여 한 줄에 10개씩 출력하고
		//  마지막에 발생횟수를 출력하는 프로그램 작성
		
		int []count = new int[10];
		int n;
		
		for(int i=0; i<100; i++) {
			n = (int)(Math.random() * 10) + 1;
			
			/* -- 비효율적.
			for(int j=0; j<10; j++) {
				if(n == j+1) {
					count[j]++;
				}
			}
			*/
			count[n-1]++;
			
			System.out.print(n + "\t");
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n숫자별 발생 횟수...");
		for(int i=0; i<count.length; i++) {
			System.out.println((i+1) + " : " + count[i]);
		}

	}

}
