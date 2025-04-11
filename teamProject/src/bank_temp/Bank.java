package bank_temp;

import java.util.List;

public interface Bank {
	// 계좌 등록
	public Account addAccount(String owner, String pwd);
	// 입금
	public long deposit(String accountNo, long amount) throws AccountNotFoudException;
	// 출금
	public long withdraw(String accountNo, String pwd, long amount) throws AccountNotFoudException, BalanceException;
	// 계좌이체
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) throws AccountNotFoudException, BalanceException;
	// 잔액조회
	public long balance(String accountNo) throws AccountNotFoudException;
	public long balance(String accountNo, String pwd) throws AccountNotFoudException;
	// 거래 내역
	public List<TransactionVO> transactionHistory(String accountNo) throws AccountNotFoudException;
	public List<TransactionVO> transactionHistory(String accountNo, String pwd) throws AccountNotFoudException;
	// 계좌-번호검색
	public Account readAccount(String accountNo);
	public Account readAccount(String accountNo, String pwd);	
	// 계좌-이름검색
	public List<Account> getAccountList(String owner);
	// 계좌-전체 리스트
	public List<Account> getAccountList();
}
