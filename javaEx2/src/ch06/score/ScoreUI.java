package ch06.score;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score ss = new Score();
	
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
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번 ? ");
		vo.setHak(sc.next());
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		ss.append(vo);
		
		System.out.println("등록이 완료되었습니다.\n");
	}

	public void updateScore() {
		System.out.println("\n>>데이터 수정<<");
		
		String hak;
		System.out.print("수정할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.findByHak(hak);
		if(vo == null) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}
		
		System.out.print("새로운 이름 ? ");
		vo.setName(sc.next());
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정이 완료되었습니다.\n");
	}
	
	public void deleteScore() {
		System.out.println("\n>>데이터 삭제<<");
		
		String hak;
		System.out.print("삭제할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.findByHak(hak);
		if(vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		
		ss.deleteScore(vo);
		
		System.out.println("등록된 자료를 삭제했습니다.\n");
		
		
	}
	
	public void findByHak() {
		System.out.println("\n>>학번 검색<<");
		
		String hak;
		System.out.print("검색할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.findByHak(hak);
		if(vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		
		System.out.println("[검색결과]");
		System.out.println("학번 : " + vo.getHak());
		System.out.println("이름 : " + vo.getName());
		System.out.println("국어 : " + vo.getKor());
		System.out.println("영어 : " + vo.getEng());
		System.out.println("수학 : " + vo.getMat());
		System.out.println("총점 : " + vo.getTot());
		System.out.println("평균 : " + vo.getAvg());
		System.out.println();
	}
	
	public void gradeScore() {
		System.out.println("\n>>평점 출력<<");
		
		int count = ss.getCount();
		ScoreVO[] list = ss.findByAll();

		double k, e, m, t;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");

		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			
			k = ss.grade(vo.getKor());
			e = ss.grade(vo.getEng());
			m = ss.grade(vo.getMat());
			t = k + e + m;
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			
			System.out.printf("%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n", k, e, m , t, t/3);
		}
		System.out.println();
	}
	
	public void listScore() {
		System.out.println("\n>>전체 리스트<<");
		
		int count = ss.getCount();
		
		System.out.println("등록인원수 : " + count);
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");

		ScoreVO[] list = ss.findByAll();
		for(int i = 0; i < count; i++) {
			System.out.print(list[i].getHak() + "\t");
			System.out.print(list[i].getName() + "\t");
			System.out.print(list[i].getKor() + "\t");
			System.out.print(list[i].getEng() + "\t");
			System.out.print(list[i].getMat() + "\t");
			System.out.print(list[i].getTot() + "\t");
			System.out.println(list[i].getAvg());
		}
		System.out.println();
	}
}
