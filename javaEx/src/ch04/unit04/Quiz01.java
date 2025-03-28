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
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, input;
		int s, o, e;
		
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

			s = o = e = 0;
			
			if(ch == 1) {
				for(int i=1; i<=input; i++) {
					s+=i;
				}
				System.out.printf("1~%d까지 합 : %d\n", input, s);
			} else if(ch == 2) {
				for(int i=2; i<=input; i+=2) {
					e+=i;
				}
				System.out.printf("1~%d까지 짝수 합 : %d\n", input, e);
			} else {
				for(int i=1; i<=input; i+=2) {
					o+=i;
				}
				System.out.printf("1~%d까지 홀수 합 : %d\n", input, o);
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
