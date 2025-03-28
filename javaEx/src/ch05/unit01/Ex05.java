package ch05.unit01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 5 명의 이름과 점수를 입력 받아 편차(수-평균)을 출력하고
		// 마지막에 총합과 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String [] name = new String[5];
		int [] score = new int[5];
		
		int tot = 0;
		double ave;
		
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1) + "번째 이름 ? ");
			name[i] = sc.next();
			System.out.print("점수 ? ");
			score[i] = sc.nextInt();
			
			tot += score[i];
		}
		
		ave = (double)tot / score.length;
		
		System.out.println("이름\t점수\t편차");
		System.out.println("-----------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\t");
			System.out.println(score[i] - ave);
		}
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + ave);

		sc.close();
	}

}
