package ch05.unit02;

import java.util.Scanner;

/*
 	- 성적 처리 프로그램 작성
 	  1) 인원수를 입력 받는다.
 	  2) 인원수만큼 이름,국,영,수를 입력 받아 총점,평균,석차를 계산해서 출력
 */

public class Ex07_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count;
		String []name;
		int [][]score;
		int []tot;
		int []rank;
		
		String []subject = {"국어", "영어", "수학"};
		
		do {
			System.out.print("인원수 ? ");
			count = sc.nextInt();
		} while(count <1);
		
		// 배열의 메모리 할당
		name = new String[count];
		score = new int[count][3];
		tot = new int[count];
		rank = new int[count];

		// 인원수 만큼 이름,국,영,수를 입력 받고 총점 계산
		for(int i=0; i<count; i++) {
			System.out.print("이름 ? ");
			name[i] = sc.next();
			for(int j=0; j<subject.length; j++) {
				System.out.print(subject[j] + " ? ");
				score[i][j] = sc.nextInt();
				
				tot[i] += score[i][j];
			}
		}
		
		// 석차 계산
		// 석차의 초기값을 1로 설정
		for(int i=0; i<rank.length; i++) {
			rank[i] = 1;
		}
		
		// 석차 계산 : selection sort 응용
		for(int i=0; i<tot.length -1; i++) {
			for(int j=i+1; j<tot.length; j++) {
				if(tot[i] > tot[j] ) {
					rank[j]++;
				} else if(tot[i] < tot[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0; i<count; i++) {
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(tot[i]+"\t");
			System.out.print((tot[i]/3)+"\t");
			System.out.println(rank[i]);
		}
		
		sc.close();
	}

}
