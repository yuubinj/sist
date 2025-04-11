package bank_temp;

import java.util.List;

// 계좌 검색 클래스
public class BankBookSearch {
	private BankBook bankBook; // 계좌 정보 객체

	public BankBookSearch(BankBook bankBook) {
		this.bankBook = bankBook;
	}

	/**
	 * 계좌의 잔액을 조회
	 * @param accountNo		잔액을 조회할 계좌번호
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException	계좌가 존재하지 않는 경우 발생할 예외
	 */
	public long balance(String accountNo) throws AccountNotFoudException {
		
		return 0L;
	}

	/**
	 * 계좌의 거래 내역 조회
	 * @param accountNo		거래내역을 조회할 계좌
	 * @return				계좌의 거래 내역 리스트
	 * @throws AccountNotFoudException	계좌가 존재하지 않는 경우 발생할 예외
	 */
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException{
		
    	return null;
	}
	
	/**
	 * 계좌 번호를 이용하여 계좌 검색
	 * @param accountNo		검색할 계좌 번호
	 * @return				계좌 번호에 대한 계좌 객체를 반환
	 */
	public Account readAccount(String accountNo) {
		    	
    	return null;
	}

	/**
	 * 계좌 번호 및 패스워드를 이용하여 계좌 검색
	 * @param accountNo		검색할 계좌 번호
	 * @param pwd			계좌의 패스워드
	 * @return				계좌 번호에 대한 계좌 객체를 반환
	 */
	public Account readAccount(String accountNo, String pwd) {
		    	
    	return null;
	}
	
	/**
	 * 이름으로 계좌 검색
	 * @param owner			검색할 계좌 소유자
	 * @return				이름으로 검색된 계좌를 저장한 List 객체
	 */
	public List<Account> getAccountList(String owner) {
		    	
    	return null;
	}

}
