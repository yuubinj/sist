package ch05.unit01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		int num;
		int []rotto = new int[6];
		
		do {
			System.out.print("구매개수[1~5] ? ");
			num = sc.nextInt();
		} while(num < 1 || num > 5);
		
		for(int n=0; n<num;n++) {
			for(int i=0; i<rotto.length; i++) {
				rotto[i] = (int)(Math.random()*45) + 1;
				for(int j=0; j<i; j++) {
					if(rotto[i] == rotto[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(rotto);
			System.out.print((n+1) + "번째:");
			for(int i=0; i<rotto.length; i++) {
				System.out.print("\t" + rotto[i]);
			}
			System.out.println();
		}

		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int []lotto = new int[6];
		int cnt;
		
		do {
			System.out.print("구매개수[1~5] ? ");
			cnt = sc.nextInt();
		} while(cnt < 1 || cnt > 5);
		
		for(int i=0; i<cnt; i++) { // 구매 개수
			// 로또 한 게임
			for(int n=0; n<lotto.length; n++) {
				lotto[n] = (int)(Math.random()*45) + 1;
				
				// 중복수 필터링
				for(int k=0; k<n; k++) {
					if(lotto[n] == lotto[k]) {
						n--;
						break;
					}
				}
			}
			
			// 정렬
			Arrays.sort(lotto);
			
			// 출력
			System.out.print((i+1) + "번째 :");
			for(int n : lotto) {
				System.out.printf("%3d", n);
			}
			System.out.println();
		}

		sc.close();

	}

}
