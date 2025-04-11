package bank_temp;

// 입출금 관리 클래스
public class BankMoney {
	private BankBookSearch bankBookSearch = null;

	public BankMoney(BankBookSearch bankBookSearch) {
		this.bankBookSearch = bankBookSearch;
	}

	/**
	 * 계좌에 입금
	 * @param accountNo		입금할 계좌 번호
	 * @param amount		입금할 금액
	 * @return				입금후 계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */
	public long deposit(String accountNo, long amount) throws AccountNotFoudException {

    	return 0L;
    }

	/**
	 * 계좌에서 출금
	 * @param accountNo		출금할 계좌 번호
	 * @param pwd			계좌의 패스워드
	 * @param amount		출금할 금액
	 * @return				출금후 계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 * @throws BalanceException				잔고가 부족한 경우 발생할 예외
	 */
    public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException{
    	
    	return 0L;
    }
    
	/**
	 * 계좌 이체
	 * @param fromAccountNo		출금할 계좌 번호
	 * @param fromPwd			출금할 계좌의 패스워드
	 * @param toAccountNo		입금할 계좌 번호
	 * @param amount			입금할 금액
	 * @return					출금한 계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 * @throws BalanceException				잔고가 부족한 경우 발생할 예외
	 */
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException {
    	
    	return 0L;
	}

	/**
	 * 계좌의 잔액 조회
	 * @param accountNo		잔액을 조회할 계좌 번호
	 * @param pwd			잔액을 조회할 계좌 패스워드
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */
	public long balance(String accountNo, String pwd) throws AccountNotFoudException {
		
    	return 0L;
	}

	/**
	 * 계좌의 잔액 조회
	 * @param accountNo		잔액을 조회할 계좌 번호
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */
	public long balance(String accountNo) throws AccountNotFoudException {
		
    	return 0L;
	}

}
