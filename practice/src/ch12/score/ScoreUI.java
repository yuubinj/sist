package ch12.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score ss = new ScoreImpl();
	
	public void menu() {
		System.out.println(">> 성적 처리 <<");
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.학번검색 5.이름검색 6.전체리스트 7.종료 => ");
					ch = Integer.parseInt(br.readLine());
				} while(ch < 1 || ch > 7);
				
				if(ch == 7) {
					System.out.println("프로그램 종료...");
					return;
				}
				
				switch(ch) {
				case 1: append(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: searchHak(); break;
				case 5: searchName(); break;
				case 6: listAll(); break;
				}
				
			} catch (Exception e) {
				
			}		
		}
	}
	
	protected void append() {
		System.out.println("\n[데이터 등록]\n");
		
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("학번 ? ");
			vo.setHak(br.readLine());

			System.out.println("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.println("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.println("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));			

			System.out.println("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void update() {
		System.out.println("\n[데이터 수정]\n");		
	}
	
	protected void delete() {
		System.out.println("\n[데이터 삭제]\n");
		
	}
	protected void searchHak() {
		System.out.println("\n[학번 검색]\n");
		
	}
	protected void searchName() {
		System.out.println("\n[이름 검색]\n");
		
	}
	protected void listAll() {
		System.out.println("\n[전체 리스트]\n");
		
	}
	
	private void print() {
		System.out.println("-----------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
	}
}
