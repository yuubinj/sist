package bank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// 계좌 관리 클래스
public class BankBook {
	private  List<Account> accountList = new ArrayList<>();

	/**
	 * 계좌 번호 만들기
	 * @return 	새로운 계좌 번호를 반환
	 */
	protected String generateAccountNo() {
		String s = "020-08-0000000";
		
		if(accountList.size() > 0) {
	    	Account account = accountList.get(accountList.size() - 1);
	    	s = account.getAccountNo();
	    }

		String s1 = s.substring(0, s.lastIndexOf("-"));
		String s2 = s.substring(s.lastIndexOf("-") + 1);

		int n = Integer.parseInt(s2) + 1;

		s = s1 + "-" + String.format("%07d", n);

		return s;
	}

	/**
	 * 새로운 계좌 등록(accountList 에 등록)
	 * @param owner		계좌 소유자 
	 * @param pwd		패스워드
	 * @return			생성된 계좌 객체(Account 객체)
	 */
	public Account addAccount(String owner, String pwd) {
		Calendar cal = Calendar.getInstance();
		
		String accountNo = generateAccountNo();
		String launch_date = String.format("%1$tF %1$tT", cal);
		
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setOwner(owner);
		account.setPwd(pwd);
		account.setLaunch_date(launch_date);
		
		accountList.add(account);
    	
    	return account;
	}

	/**
	 * 계좌-전체 리스트
	 * @return	전체 계좌 리스트 반환
	 */
	public List<Account> getAccountList() {

		return accountList;
	}
}
