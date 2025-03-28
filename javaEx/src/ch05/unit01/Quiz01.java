package ch05.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int y;
		String []ddi = {"원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양"};
		
		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		} while(y<1900);
		
		String dd = ddi[y%12];
		System.out.printf("%d년도는 %s띠의 해 입니다.", y, dd);

		sc.close();
	}

}
