package db.item3.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private SalaryDAO dao = new SalaryDAO();
	private EmployeeUI emp = null;
	
	public SalaryUI(EmployeeUI emp) {
		this.emp = emp;
	}
	
	public void salaryManage() {
		int ch = 0;
		
		while(true) {
			System.out.println("\n[급여관리]");
			
			try {
				System.out.print("1.등록 2.수정 3.삭제 4.월별급여리스트 5.사번검색 6.전체급여리스트 7.사원리스트 8.메인 => ");
				ch = Integer.parseInt(br.readLine());
				
				if(ch == 8) return;
				
				switch(ch) {
				case 1: payment(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: monthList(); break;
				case 5: findBySabeon(); break;
				case 6: listAll(); break;
				case 7: emp.listAll(); break;
				}
			} catch (Exception e) {
			}
		}
	}
	
	public void payment() {
		System.out.println("\n[급여 등록]");
		
		SalaryDTO dto = new SalaryDTO();
		
		try {
			System.out.print("사원번호 ? ");
			dto.setSabeon(br.readLine());
			
			System.out.print("급여년월[YYYYMM] ? ");
			dto.setPayDate(br.readLine());
			
			System.out.print("급여지급일자[YYYY-MM-DD] ? ");
			dto.setPaymentDate(br.readLine());
			
			System.out.print("기본급 ? ");
			dto.setPay(Integer.parseInt(br.readLine()));
			
			System.out.print("수당 ? ");
			dto.setSudang(Integer.parseInt(br.readLine()));
			
			if(dto.getPay() + dto.getSudang() >= 3000000) {
				dto.setTax((int)((dto.getPay() + dto.getSudang())*0.03));
			} else if(dto.getPay() + dto.getSudang() >= 2000000) {
				dto.setTax((int)((dto.getPay() + dto.getSudang())*0.02));
			} else {
				dto.setTax(0);
			}

			System.out.print("메모 ? ");
			dto.setMemo(br.readLine());

			int result = dao.insertSalary(dto);
			
			if(result > 0) {
				System.out.println("급여 등록이 완료되었습니다.");
			} else {
				System.out.println("급여 등록 에러 발생!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		System.out.println("\n[급여 수정]");
		int salaryNum;
		
		SalaryDTO dto = new SalaryDTO();
		
		try {
			System.out.print("수정할 급여번호 ? ");
			salaryNum = Integer.parseInt(br.readLine());
			dto.setSalaryNum(salaryNum);
			
			System.out.print("급여년월[YYYYMM] ? ");
			dto.setPayDate(br.readLine());
			
			System.out.print("급여지급일자[YYYY-MM-DD] ? ");
			dto.setPaymentDate(br.readLine());
			
			System.out.print("기본급 ? ");
			dto.setPay(Integer.parseInt(br.readLine()));
			
			System.out.print("수당 ? ");
			dto.setSudang(Integer.parseInt(br.readLine()));
			
			if(dto.getPay() + dto.getSudang() >= 3000000) {
				dto.setTax((int)((dto.getPay() + dto.getSudang())*0.03));
			} else if(dto.getPay() + dto.getSudang() >= 2000000) {
				dto.setTax((int)((dto.getPay() + dto.getSudang())*0.02));
			} else {
				dto.setTax(0);
			}
			
			System.out.print("메모 ? ");
			dto.setMemo(br.readLine());
			
			int result = dao.updateSalary(dto);
			
			if(result > 0) {
				System.out.println("급여 수정이 완료되었습니다.");
			} else {
				System.out.println("급여 수정 에러 발생!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete() {
		System.out.println("\n[급여 삭제]");
		int salaryNum;
		
		try {
			System.out.print("삭제할 급여번호 ? ");
			salaryNum = Integer.parseInt(br.readLine());
			
			int result = dao.deleteSalary(salaryNum);
			
			if(result > 0) {
				System.out.println("급여 삭제가 완료되었습니다.");
			} else {
				System.out.println("급여 삭제 에러 발생!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void findBySabeon() {
		System.out.println("\n[사번 검색]");
		String payDate;
		String sabeon;
		
		
		try {
			System.out.print("검색할 급여년월[YYYYMM] ? ");
			payDate = br.readLine();
			
			System.out.print("검색할 사원번호 ? ");
			sabeon = br.readLine();
			
			Map<String, Object> map = new HashMap<>();
			
			map.put("사원번호", sabeon);
			map.put("급여년월", payDate);

			List<SalaryDTO> list = dao.listSalary(map);
			
			title();
			for(SalaryDTO dto : list) {
				print(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void monthList() {
		System.out.println("\n[월별 리스트]");
		String payDate;
		
		try {
			System.out.print("검색할 급여년월[YYYYMM] ? ");
			payDate = br.readLine();
			
			List<SalaryDTO> list = dao.listSalary(payDate);
			
			System.out.println();
			System.out.print("급여번호\t");
			System.out.print("사번\t");
			System.out.print("이름\t");
			System.out.print("급여년월\t");
			System.out.print("지급일자\t\t");
			System.out.print("기본급\t\t");
			System.out.print("수당\t\t");
			System.out.print("총급여\t\t");
			System.out.print("세금\t\t");
			System.out.println("실수령액");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

			for(SalaryDTO dto : list) {
				System.out.print(dto.getSalaryNum() + "\t");
				System.out.print(dto.getSabeon() + "\t");
				System.out.print(dto.getName() + "\t");
				System.out.print(dto.getPayDate() + "\t");
				System.out.print(dto.getPaymentDate() + "\t");
				System.out.print(dto.getPay() + "\t\t");
				System.out.print(dto.getSudang() + "\t\t");
				System.out.print(dto.getTot() + "\t\t");
				System.out.print(dto.getTax() + "\t\t");
				System.out.println(dto.getAfterPay());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listAll() {
		System.out.println("\n[급여 리스트]");
		
		List<SalaryDTO> list = dao.listSalary();
		
		title();
		for(SalaryDTO dto : list) {
			print(dto);
		}
	}
	
	public void title() {
		System.out.println();
		System.out.print("급여번호\t");
		System.out.print("사번\t");
		System.out.print("이름\t");
		System.out.print("급여년월\t");
		System.out.print("지급일자\t\t");
		System.out.print("기본급\t\t");
		System.out.print("수당\t\t");
		System.out.println("총급여\t\t");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	public void print(SalaryDTO dto) {
		System.out.print(dto.getSalaryNum() + "\t");
		System.out.print(dto.getSabeon() + "\t");
		System.out.print(dto.getName() + "\t");
		System.out.print(dto.getPayDate() + "\t");
		System.out.print(dto.getPaymentDate() + "\t");
		if(dto.getPaymentDate() == null) {
			System.out.print("\t");
		}
		System.out.print(dto.getPay() + "\t\t");
		System.out.print(dto.getSudang() + "\t\t");
		System.out.println(dto.getTot());
	}

}
