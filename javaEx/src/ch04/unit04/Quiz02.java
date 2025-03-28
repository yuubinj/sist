package ch04.unit04;

import java.util.Scanner;

/*
  1.합 2.짝수합 3.홀수합 4.종료 => 1
  수 ? 10
  1~0 까지 합 : 55
  
  1.합 2.짝수합 3.홀수합 4.종료 => 2
  수 ? 10
  1~0 까지 합 : 30
  
  1.합 2.짝수합 3.홀수합 4.종료 => 4
*/
public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, input;
		int s, start, step;
		String title;
		
		while(true) {
			do {
				System.out.print("1.합 2.짝수합 3.홀수합 4.종료 => ");
				ch = sc.nextInt();				
			} while(ch < 1 || ch > 4);
			
			if(ch == 4) {
				System.out.println("프로그램 종료!!!");
				break;
			}
			
			System.out.print("수 입력 ? ");
			input = sc.nextInt();

			s = 0;
			if(ch == 1) {
				start = 1; step = 1; title = "합";
			} else if(ch == 2) {
				start = 2; step = 2; title = "짝수 합";	
			} else {
				start = 1; step = 2; title = "홀수 합";
			}
			
			for(int n=start; n<=input; n+=step) {
				s+=n;
			}
			System.out.println(title + " : " + s);
			System.out.println();
		}
		
		sc.close();
	}

}
