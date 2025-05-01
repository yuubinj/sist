package db.item3.member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import db.util.DBConn;

public class MemberUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private MemberDAO dao = new MemberDAOImpl();

	public void menu() {
		int ch;
		
		System.out.println("<회원관리 프로그램>\n");
		while(true) {
			try {
				System.out.print("1.등록 2.수정 3.삭제 4.아이디검색 5.이름검색 6.리스트 7.종료 => ");
				ch = Integer.parseInt(br.readLine());
				
				if(ch == 7) {
					DBConn.close();
					System.out.println("프로그램 종료..");
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: findById(); break;
				case 5: findByName(); break;
				case 6: listAll(); break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
	
	protected void insert() {
		System.out.println("[회원 추가]");
				
		MemberDTO dto = new MemberDTO();

		try {

			System.out.print("아이디 ? ");
			dto.setId(br.readLine());
			
			System.out.print("비밀번호 ? ");
			dto.setPwd(br.readLine());
			
			System.out.print("이름 ? ");
			dto.setName(br.readLine());
			
			System.out.print("생년월일[YYYY-MM-DD] ? ");
			dto.setBirth(br.readLine());
			
			System.out.print("이메일 ? ");
			dto.setEmail(br.readLine());
			
			System.out.print("전화번호 ? ");
			dto.setTel(br.readLine());
			
			dao.insertMember(dto);
			
			System.out.println("데이터 등록이 완료되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	protected void update() {
		System.out.println("[회원 수정]");
		String id;
		
		try {
			MemberDTO dto = new MemberDTO();

			System.out.print("수정할 아이디 ? ");
			id = br.readLine();
			dto.setId(id);
			
			MemberDTO dto_for_print = dao.readMember(id);
			
			title();
			print(dto_for_print);
			
			System.out.print("새로운 비밀번호 ? ");
			dto.setPwd(br.readLine());

			System.out.print("새로운 이름 ? ");
			dto.setName(br.readLine());
			
			System.out.print("새로운 생년월일[YYYY-MM-DD] ? ");
			dto.setBirth(br.readLine());
			
			System.out.print("새로운 이메일 ? ");
			dto.setEmail(br.readLine());
			
			System.out.print("새로운 전화번호 ? ");
			dto.setTel(br.readLine());
			
			int result = dao.updateMember(dto);
			
			if(result > 0) {
				System.out.println("데이터 수정이 완료되었습니다.");				
			} else {
				System.out.println("없는 데이터입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void delete() {
		System.out.println("[회원 삭제]");
		String id;
		
		try {
			System.out.print("삭제할 아이디 ? ");
			id = br.readLine();
			
			int result = dao.deleteMember(id);
			
			if(result > 0) {
				System.out.println("데이터 삭제가 완료되었습니다.");				
			} else {
				System.out.println("없는 데이터입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void findById() {
		System.out.println("[아이디 검색]");
		String id;

		try {
			System.out.print("검색할 아이디 ? ");
			id = br.readLine();
			
			MemberDTO dto = dao.readMember(id);
			
			title();
			print(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void findByName() {
		System.out.println("[이름 검색]");
		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			
			List<MemberDTO> list = dao.listMember(name);
			
			title();
			for(MemberDTO dto : list) {
				print(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void listAll() {
		System.out.println("[전체 리스트]");
		
		List<MemberDTO> list = dao.listMember();
		
		title();
		for(MemberDTO dto : list) {
			print(dto);
		}
		
	}
	
	public void title() {
		System.out.print("아이디\t");
		System.out.print("비밀번호\t");
		System.out.print("이름\t");
		System.out.print("생일\t\t");
		System.out.print("이메일\t\t");
		System.out.println("전화번호");
	}
	
	public void print(MemberDTO dto) {
		System.out.print(dto.getId() + "\t");
		System.out.print(dto.getPwd() + "\t");
		System.out.print(dto.getName() + "\t");
		if(dto.getBirth() == null) {
			System.out.print(dto.getBirth() + "\t\t");
		} else {
			System.out.print(dto.getBirth() + "\t");			
		}
		System.out.print(dto.getEmail() + "\t");
		System.out.println(dto.getTel());
	}

	
}
