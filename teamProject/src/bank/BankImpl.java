package bank;

import java.util.List;

public class BankImpl implements Bank {
	private BankBook bankBook = new BankBook(); // 계좌 관리 클래스
	private BankBookSearch bankBookSearch = null; // 계좌 검색 클래스
	private BankMoney bankMoney = null; // 계좌 입출금 클래스

	public BankImpl() {
		bankBookSearch = new BankBookSearch(bankBook);
		bankMoney = new BankMoney(bankBookSearch);
	}

	/**
	 * 계좌 등록(BankBook 클래스의 addAccount() 메소드 호출)
	 * @param owner		계좌 소유자
	 * @param pwd		계좌 패스워드
	 * @return			등록된 계좌
	 */		
	@Override
	public Account addAccount(String owner, String pwd) {
		// 계좌 등록
		Account account = bankBook.addAccount(owner, pwd);
		return account;
	}

	/**
	 * 계좌에 입금(BankMoney의 deposit() 메소드 호출)
	 * @param accountNo		입금할 계좌 번호
	 * @param amount		입금할 금액
	 * @return				입금후 계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */	
	@Override
	public long deposit(String accountNo, long amount) throws AccountNotFoudException {
		// 입금
		long balance = 0L;
		
		try {
			balance = bankMoney.deposit(accountNo, amount);
		} catch (AccountNotFoudException e) {
			throw e;
		}
		
		return balance;
	}

	/**
	 * 계좌에서 출금(BankMoney의 withdraw() 메소드 호출)
	 * @param accountNo		출금할 계좌 번호
	 * @param pwd			계좌의 패스워드
	 * @param amount		출금할 금액
	 * @return				출금후 계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 * @throws BalanceException				잔고가 부족한 경우 발생할 예외
	 */	
	@Override
	public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException {
		// 출금
		long balance = 0L;
		
		try {
			balance = bankMoney.withdraw(accountNo, pwd, amount);
		} catch (AccountNotFoudException e) {
			throw e;
		} catch (BalanceException e) {
			throw e;
		}
		return balance;
	}

	/**
	 * 계좌 이체(BankMoney의 accountTransfer() 메소드 호출)
	 * @param fromAccountNo		출금할 계좌 번호
	 * @param fromPwd			출금할 계좌의 패스워드
	 * @param toAccountNo		입금할 계좌 번호
	 * @param amount			입금할 금액
	 * @return					출금한 계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 * @throws BalanceException				잔고가 부족한 경우 발생할 예외
	 */		
	@Override
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException{
		// 계좌이체
		long fromBalance = 0L;
		
		try {
			fromBalance = bankMoney.accountTransfer(fromAccountNo, fromPwd, toAccountNo, amount);
		} catch (AccountNotFoudException e) {
			throw e;
		} catch (BalanceException e) {
			throw e;
		}

		// 출금한 계좌의 잔액
		return fromBalance;
	}

	/**
	 * 계좌의 잔액 조회(BankMoney의 balance() 메소드 호출)
	 * @param accountNo		잔액을 조회할 계좌 번호
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */		
	@Override
	public long balance(String accountNo) throws AccountNotFoudException{
		// 잔액조회
		long balance = 0L;
		try {
			balance = bankMoney.balance(accountNo);
		} catch (AccountNotFoudException e) {
			throw e;
		}
		return balance;
	}

	/**
	 * 계좌의 잔액 조회(BankMoney의 balance() 메소드 호출)
	 * @param accountNo		잔액을 조회할 계좌 번호
	 * @param pwd			잔액을 조회할 계좌 패스워드
	 * @return				계좌의 잔액을 반환
	 * @throws AccountNotFoudException		계좌가 존재하지 않는 경우 발생할 예외
	 */		
	@Override
	public long balance(String accountNo, String pwd) throws AccountNotFoudException{
		// 잔액조회
		long balance = 0L;
		try {
			balance = bankMoney.balance(accountNo, pwd);
		} catch (Exception e) {
			throw e;
		}
		return balance;
	}
	
	/**
	 * 계좌의 거래 내역 조회(BankBookSearch 클래스의 transactionHistory() 호출)
	 * @param accountNo		거래내역을 조회할 계좌
	 * @param pwd			거래내역을 조회할 계좌 패스워드
	 * @return				계좌의 거래 내역 리스트
	 * @throws AccountNotFoudException	계좌가 존재하지 않는 경우 발생할 예외
	 */		
	@Override
	public List<TransactionVO> transactionHistory(String accountNo, String pwd) throws AccountNotFoudException{
		// 거래 내역
		Account account = readAccount(accountNo, pwd);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
		return bankBookSearch.transactionHistory(accountNo);
	}
	
	/**
	 * 계좌의 거래 내역 조회(BankBookSearch 클래스의 transactionHistory() 호출)
	 * @param accountNo		거래내역을 조회할 계좌
	 * @return				계좌의 거래 내역 리스트
	 * @throws AccountNotFoudException	계좌가 존재하지 않는 경우 발생할 예외
	 */		
	@Override
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException{
		Account account = readAccount(accountNo);
		if(account == null) {
			throw new AccountNotFoudException("등록된 계좌가 아닙니다.");
		}
		
		return bankBookSearch.transactionHistory(accountNo);
	}
	
	/**
	 * 계좌 번호의 계좌 조회(BankBookSearch 클래스의 readAccount() 호출)
	 * @param accountNo		조회할 계좌 번호
	 * @return				검색된 계좌
	 */		
	@Override
	public Account readAccount(String accountNo) {
		// 계좌-번호검색
		return bankBookSearch.readAccount(accountNo);
	}
	
	/**
	 * 계좌 번호의 계좌 조회(BankBookSearch 클래스의 readAccount() 호출)
	 * @param accountNo		조회할 계좌 번호
	 * @param pwd			조회할 계좌의 패스워드
	 * @return				검색된 계좌
	 */		
	@Override
	public Account readAccount(String accountNo, String pwd) {
		return bankBookSearch.readAccount(accountNo);
	}
	
	/**
	 * 이름으로 계좌 검색(BankBookSearch 클래스의 getAccountList() 호출)
	 * @param owner			검색할 계좌 소유자
	 * @return				이름으로 검색된 계좌를 저장한 List 객체
	 */	
	@Override
	public List<Account> getAccountList(String owner) {
		// 계좌-이름검색
		return bankBookSearch.getAccountList(owner);
	}

	/**
	 * 전체 계좌 리스트(BankBookSearch 클래스의 getAccountList() 호출)
	 * @return				전체 계좌 리스트
	 */	
	@Override
	public List<Account> getAccountList() {
		// 계좌-전체 리스트
		return bankBook.getAccountList();
	}
}
