package ch07.unit06;

import java.util.Random;
import java.util.Scanner;

/*
  Q) 1~100 사이의 난수를 발생하여 20번 안에 알아 맞추는 게임
     20번 안에 맞추지 못하면 실패했습니다. 출력 후 종료
     
  	 - 실행 예 : 발생된 난수가 23 인 경우
  	 
  	   수 ? 3
  	   3보다 큰 수 입니다.
  	   
  	   수 ? 50
  	   50보다 작은 수 입니다.
  	   
  	   수 ? 23
  	   3번에 성공했습니다.
 */

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		/*
		int num = rnd.nextInt(100) + 1;
		int count = 0;
		int input;
		boolean flag = false;

		System.out.println(num);
		for(int i=0; i<20; i++) {
			System.out.print("수 ? ");
			input = sc.nextInt();
			
			count ++;
			
			if(input < num) {
				System.out.printf("%d보다 큰 수 입니다.\n", input);	
			} else if(input > num) {
				System.out.printf("%d보다 작은 수 입니다.\n", input);	
			} else {
				System.out.printf("%d번에 성공했습니다.\n", count);
				flag = true;
				break;
			}
			
		}
		
		if(! flag) {			
			System.out.println("실패했습니다.");
		}
		*/
		
		int com = rnd.nextInt(100) + 1;
		int input;
		int count = 0;

		do {
			System.out.print("수 ? ");
			input = sc.nextInt();
			
			if(input < com) {
				System.out.printf("%d보다 큰 수 입니다.\n", input);	
			} else if(input > com) {
				System.out.printf("%d보다 작은 수 입니다.\n", input);	
			}
			count ++;
			
		} while(input != com && count < 20);
		
		System.out.println("com : " + com);
		if(input != com) {
			System.out.println("실패 했습니다.");
		}
		
		sc.close();
	}

}
