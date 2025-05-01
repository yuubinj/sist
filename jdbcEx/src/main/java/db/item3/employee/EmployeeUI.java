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
		
		EmployeeDTO dto = new EmployeeDTO();
		
		try {
			System.out.print("사원번호 ? ");
			dto.setSabeon(br.readLine());
			
			System.out.print("이름 ? ");
			dto.setName(br.readLine());
			
			System.out.print("생년월일 ? ");
			dto.setBirth(br.readLine());
			
			System.out.print("전화번호 ? ");
			dto.setTel(br.readLine());
			
			int result = dao.insertEmployee(dto);
			
			if(result > 0) {
				System.out.println("사원 등록이 완료되었습니다.");
			} else {
				System.out.println("사원 등록 에러 발생");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		System.out.println("\n사원 정보 수정...");
		
		try {
			EmployeeDTO dto = new EmployeeDTO();

			System.out.print("수정할 사원번호 ? ");
			String sabeon = br.readLine();
			dto.setSabeon(sabeon);
			
			dto = dao.readEmployee(sabeon);
			
			title();
			print(dto);
			
			System.out.print("새로운 이름 ? ");
			dto.setName(br.readLine());
			
			System.out.print("새로운 생년월일 ? ");
			dto.setBirth(br.readLine());

			System.out.print("새로운 전화번호 ? ");
			dto.setTel(br.readLine());
			
			int result = dao.updateEmployee(dto);
			
			if(result > 0) {
				System.out.println("사원 수정이 완료되었습니다.");
			} else {
				System.out.println("사원 수정 에러 발생");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void findBySabeon() {
		System.out.println("\n사번 검색...");
		String sabeon;
		
		try {
			System.out.print("검색할 사번 ? ");
			sabeon = br.readLine();
			EmployeeDTO dto = dao.readEmployee(sabeon);
			
			title();
			print(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findByName() {
		System.out.println("\n이름 검색...");
		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			List<EmployeeDTO> list = dao.listEmployee(name);
			
			title();
			for(EmployeeDTO dto : list) {
				print(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listAll() {
		System.out.println("\n사원 리스트...");
		
		List<EmployeeDTO> list = dao.listEmployee();
		
		title();
		for(EmployeeDTO dto : list) {
			print(dto);
		}

	}
	
	public void title() {
		System.out.print("사번\t");
		System.out.print("이름\t");
		System.out.print("생년월일\t\t");
		System.out.println("전화번호");
		System.out.println("------------------------------------------------");
	}
	
	public void print(EmployeeDTO dto) {
		System.out.print(dto.getSabeon() + "\t");
		System.out.print(dto.getName() + "\t");
		System.out.print(dto.getBirth() + "\t");
		System.out.println(dto.getTel());
	}
}
