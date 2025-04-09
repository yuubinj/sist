package ch12.addr_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import ch12.score2.MyDuplicationException;

/*
  - 데이터 등록
  	: 이름, 전화번호, 생년월일, 주소, 등록일
  	: 등록일은 컴퓨터 시스템의 날짜에서 yyyy-MM-dd 형식만 등록
  	: 이름과 전화번호가 동일하면 등록 불가(선택사항)
  	: 생년월일은 yyyy-MM-dd 형식이 아니면 등록불가(선택사항)
  
  - 데이터 출력
  	: 이름 전화번호 생년월일 나이 주소 등록일
  	: 나이는 생년월일을 기준으로 계산(선택사항)
 */

public class AddressUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Address addr = new AddressImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				System.out.print("1.등록 2.수정 3.삭제 4.이름검색 5.전체리스트 6.종료 =>");
				ch = Integer.parseInt(br.readLine());
				
				if(ch == 6) {
					System.out.println("\n프로그램을 종료합니다.");
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: searchName(); break;
				case 5: printAll(); break;
				}
				
			} catch (IOException e) {
			} catch (Exception e) {
			}
		}
	}
	
	protected void insert() throws IOException {
		System.out.println("\n[데이터 등록]");
		
		try {
			AddressVO vo = new AddressVO();
			
			// 이름, 전화번호, 생년월일, 주소, 등록일
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("전화번호 ? ");
			vo.setTel(br.readLine());
			
			System.out.print("생년월일 ? ");
			String b = br.readLine();
			if(! isValidBirth(b)) {
				return;
			}
			vo.setBirth(b);
			
			System.out.print("주소 ? ");
			vo.setAddress(br.readLine());
			
			// 등록일
			LocalDate localDate = LocalDate.now();
			String d = localDate.toString();
			System.out.println("등록일 : " + d);
			vo.setDate(d);
			
			addr.insertAddress(vo);
			
			System.out.println("데이터가 등록되었습니다.");

		} catch (MyDuplicationException e) {
			System.out.println("등록된 학번입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	protected void update() throws IOException {
		System.out.println("\n[데이터 수정]");

		System.out.print("수정할 이름 ? ");
		String n = br.readLine();
		
		System.out.print("수정할 전화번호 ? ");
		String t = br.readLine();

		AddressVO vo = addr.findById(n, t);
		
		System.out.print("새로운 생년월일 ? ");
		String b = br.readLine();
		if(! isValidBirth(b)) {
			return;
		}
		
		System.out.print("새로운 주소 ? ");
		String a = br.readLine();
		
		vo.setBirth(b);
		vo.setAddress(a);
		
		System.out.println("데이터가 수정되었습니다.");
		
	}
	
	protected void delete() throws IOException{
		System.out.println("\n[데이터 삭제]");
		
		System.out.print("삭제할 이름 ? ");
		String n = br.readLine();
		
		System.out.print("삭제할 전화번호 ? ");
		String t = br.readLine();

		addr.deleteAddress(n, t);
		
		System.out.println("데이터가 삭제되었습니다.");
	}
	
	protected void searchName() throws IOException {
		System.out.println("\n[이름 검색]");
		
		System.out.print("검색할 이름 ? ");
		String n = br.readLine();
		List<AddressVO> list = addr.findByName(n);
		
		print();
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
	}
	
	protected void printAll() {
		System.out.println("\n[전체 리스트]");
		
		List<AddressVO> list = addr.findByAll();
		print();
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
		
	}
	
	private void print() {
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t전화번호\t생년월일\t\t나이\t주소\t등록일");
		System.out.println("---------------------------------------------------");
	
	}
	
	public boolean isValidBirth(String birth) {
		
		try {
			// 20051010, 2005.10.10, 2005/10/10, 2005-10-10
			if(birth.length() != 8 && birth.length() != 10) {
				System.out.println("등록 불가합니다. yyyy-MM-dd 형식으로 등록하십시오.");
				return false;
			}
			
			birth = birth.replaceAll("(\\-)", "");			
			
			if(birth.length() != 8) {
				System.out.println("등록 불가합니다. yyyy-MM-dd 형식으로 등록하십시오.");
				return false;
			}
			
			int y = Integer.parseInt(birth.substring(0,4));
			int m = Integer.parseInt(birth.substring(4,6));
			int d = Integer.parseInt(birth.substring(6));
			
			Calendar cal = Calendar.getInstance();
			cal.set(y, m-1, d);
			
			int y1 = cal.get(Calendar.YEAR);
			int m1 = cal.get(Calendar.MONTH) + 1;
			int d1 = cal.get(Calendar.DATE);
			
			if(y != y1 || m != m1 || d != d1) {
				System.out.println("등록 불가합니다. 없는 날짜입니다.");
				return false;
			}
			
			
		} catch (Exception e) {
			// 예외가 발생한 경우
			System.out.println("등록 불가합니다. yyyy-MM-dd 형식으로 등록하십시오.");
			return false;
		}
		
		return true;
	}
	
}