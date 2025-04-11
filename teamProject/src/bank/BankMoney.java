package bank;

import java.util.Calendar;

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
		Account account = bankBookSearch.readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);
		
    	TransactionVO vo = new TransactionVO();
    	long balance = balance(accountNo);
   		balance += amount;
    	
    	vo.setTransaction_date(transaction_date);
    	vo.setAmount(amount);
    	vo.setBalance(balance);
    	vo.setKind("입금");
    	vo.setInfo("본인");
		
    	account.addTransaction(vo);

    	return balance;
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
		Account account = bankBookSearch.readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}

		long balance = balance(accountNo);
		if(amount > balance) {
			throw new BalanceException("잔고가 부족합니다.");
		}
		
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);
		
    	TransactionVO vo = new TransactionVO();
    	
   		balance -= amount;
    	
    	vo.setTransaction_date(transaction_date);
    	vo.setAmount(amount);
    	vo.setBalance(balance);
    	vo.setKind("출금");
    	vo.setInfo("본인");
		
    	account.addTransaction(vo);
    	
    	return balance;
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
		// 출금할 계좌
		Account fromAccount = bankBookSearch.readAccount(fromAccountNo, fromPwd);
		if(fromAccount == null) {
			throw new AccountNotFoudException("출금할 계좌는 등록된 계좌가 아닙니다.");
		}

		// 입금할 계좌
		Account toAccount = bankBookSearch.readAccount(toAccountNo);
		if(toAccount == null) {
			throw new AccountNotFoudException("입금할 계좌는 등록된 계좌가 아닙니다.");
		}
		
		// 출금할 계좌의 잔고
		long fromBalance = balance(fromAccountNo);
		if(amount > fromBalance) {
			throw new BalanceException("잔고가 부족합니다.");
		}
		fromBalance -= amount;
		
		// 입금할 계좌의 잔고
		long toBalance = balance(toAccountNo);
		toBalance += amount;
		
		// 입/출금 일자
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);
		
    	TransactionVO fromVo = new TransactionVO();
    	TransactionVO toVo = new TransactionVO();
    	
    	// 출금할 계좌의 거래 내역
    	fromVo.setTransaction_date(transaction_date);
    	fromVo.setAmount(amount);
    	fromVo.setBalance(fromBalance);
    	fromVo.setKind("출금");
    	fromVo.setInfo("계좌이체");
    	fromAccount.addTransaction(fromVo);
		String name = fromAccount.getOwner();
				
    	// 입금할 계좌의 거래 내역
    	toVo.setTransaction_date(transaction_date);
    	toVo.setAmount(amount);
    	toVo.setBalance(toBalance);
    	toVo.setKind("입금");
    	toVo.setInfo(name);
    	toAccount.addTransaction(toVo);
    	
    	// 출금한 계좌의 잔액
    	return fromBalance;
	}

	/**
	 * 계좌의 잔액 조회
	 * @param accountNo		잔액을 조회할 계좌 번호
	 * @param pwd			잔액을 조회할 계좌 패스워드
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */
	public long balance(String accountNo, String pwd) throws AccountNotFoudException {
		Account account = bankBookSearch.readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
    	
		TransactionVO vo = account.lastTransaction();
		long balance = 0L;
		if(vo != null) {
			balance = vo.getBalance();
		}
		
    	return balance;
	}

	/**
	 * 계좌의 잔액 조회
	 * @param accountNo		잔액을 조회할 계좌 번호
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */
	public long balance(String accountNo) throws AccountNotFoudException {
		Account account = bankBookSearch.readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
    	
		TransactionVO vo = account.lastTransaction();
		long balance = 0L;
		if(vo != null) {
			balance = vo.getBalance();
		}
		
    	return balance;
	}

}
