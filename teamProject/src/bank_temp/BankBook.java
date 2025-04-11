package bank_temp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// 계좌 관리 클래스
public class BankBook {
	// 전체 계좌 리스트
	private  List<Account> accountList = new ArrayList<>();

	/**
	 * 계좌 번호 만들기
	 * @return 	새로운 계좌 번호
	 */
	protected String generateAccountNo() {
		
		return null;
	}

	/**
	 * 새로운 계좌 등록(accountList 에 등록)
	 * @param owner		계좌 소유자 
	 * @param pwd		패스워드
	 * @return			생성된 계좌 객체(Account 객체)
	 */
	public Account addAccount(String owner, String pwd) {
    	
    	return null;
	}

	/**
	 * 계좌-전체 리스트
	 * @return	전체 계좌 리스트 반환
	 */
	public List<Account> getAccountList() {
		// 계좌-전체리스트
		return accountList;
	}
}
