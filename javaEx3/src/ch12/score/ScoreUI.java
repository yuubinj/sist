package ch12.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score ss = new ScoreImpl(); // ScoreUI 가 죽어야지 죽음. 하지만 menu()가 무한루프(while true)이기 때문에 return 하기 전까지 죽지 않음.
										// 즉 이 안에 있는 list 객체가 return 하기 전까지 죽지 않는다는 뜻.
	
	public void menu() {
		System.out.println("\t>> 성적처리 <<");
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.학번검색 5.이름검색 6.전체리스트 7.종료 => ");
					ch = Integer.parseInt(br.readLine());
				} while(ch < 1 || ch > 7); // do~while 문장 지워도 실행 됨
				
				if(ch == 7) {
					System.out.println("\n프로그램을 종료합니다...");
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
		System.out.println("\n데이터 등록...");
		
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.print("학번 ? ");
			vo.setHak(br.readLine());

			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			ss.insertScore(vo);
			
			System.out.println("데이터가 등록되었습니다.");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 입력 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void update() {
		System.out.println("\n데이터 수정...");
		
		try {
			String hak;
			
			System.out.print("수정할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = ss.findByHak(hak);
			if(vo == null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
			
			System.out.print("새로운 이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("수정이 완료되었습니다.");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void delete() {
		System.out.println("\n데이터 삭제...");
		String hak;
		
		try {
			System.out.print("삭제할 학번 ? ");
			hak = br.readLine();
			
			boolean b = ss.deleteScore(hak);
			
			if(b) {
				System.out.println("데이터가 삭제되었습니다.");	
			} else {
				System.out.println("등록된 학번이 아닙니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	protected void listAll() {
		System.out.println("\n전체 리스트...");
		
		List<ScoreVO> list = ss.findByAll();
		
		System.out.println("등록인원수 : " + list.size());
		printTitle();
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}

	protected void searchHak() {
		System.out.println("\n학번 검색...");
		
		String hak;
		
		try {
			System.out.print("검색할 학번 ? ");
			hak = br.readLine();
			ScoreVO vo = ss.findByHak(hak);
			
			if(vo == null) {
				System.out.println("등록된 학번이 아닙니다.");
				return;
			}
			
			printTitle();
			System.out.println(vo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	protected void searchName() {
		System.out.println("\n이름 검색...");
		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
		
			List<ScoreVO> list = ss.findByName(name);
		
			if(list.size() == 0) {
				System.out.println("등록된 데이터가 없습니다.");
				return;
			}
			
			printTitle();
			for(ScoreVO vo : list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}
	
	private void printTitle() {
		System.out.println("--------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
	}
}
