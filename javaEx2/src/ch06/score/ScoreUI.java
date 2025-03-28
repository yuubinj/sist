package ch06.score;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int ch;
		
		while(true) {
			do {
				System.out.print("1.등록 2.수정 3.삭제 4.학번검색 5.평점 6.리스트 7.종료 => ");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 7);
			
			if(ch == 7) {
				System.out.println("프로그램을 종료 합니다.");
				return; // menu() 함수 나가기
			}
			
			switch(ch) {
			case 1: insertScore(); break;
			case 2: updateScore(); break;
			case 3: deleteScore(); break;
			case 4: findByHak(); break;
			case 5: gradeScore(); break;
			case 6: listScore(); break;
			}
		
		}
		
	}
	
	public void insertScore() {
		System.out.println("\n>>데이터 등록<<");
	}

	public void updateScore() {
		System.out.println("\n>>데이터 수정<<");
	}
	
	public void deleteScore() {
		System.out.println("\n>>데이터 삭제<<");
	}
	
	public void findByHak() {
		System.out.println("\n>>학번 검색<<");
	}
	
	public void gradeScore() {
		System.out.println("\n>>평점 출력<<");
	}
	
	public void listScore() {
		System.out.println("\n>>전체 리스트<<");
	}
}
