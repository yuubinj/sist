package db.item3.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class EmployeeUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private EmployeeDAO dao = new EmployeeDAO();
	
	public void employeeManage() {
		int ch = 0;
		
		while(true) {
			System.out.println("\n[사원관리]");
			
			try {
				System.out.print("1.사원등록 2.정보수정 3.사번검색 4.이름검색 5.사원리스트 6.메인 => ");
				ch = Integer.parseInt(br.readLine());
				
				if(ch == 6) return;
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: findBySabeon(); break;
				case 4: findByName(); break;
				case 5: listAll(); break;
				}
			} catch (Exception e) {
			}
		}
	}
	
	public void insert() {
		System.out.println("\n사원 등록...");
		
		
	}
	
	public void update() {
		System.out.println("\n사원 정보 수정...");
		
		
	}
	
	public void findBySabeon() {
		System.out.println("\n사번 검색...");
		
	}

	public void findByName() {
		System.out.println("\n이름 검색...");
		
	}
	
	public void listAll() {
		System.out.println("\n사원 리스트...");

	}
}
