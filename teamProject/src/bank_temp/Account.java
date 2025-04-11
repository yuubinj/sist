package bank_temp;

import java.util.ArrayList;
import java.util.List;

// 계좌 정보 및 계좌 거래 내역 정보
public class Account {
	private String accountNo;	// 계좌번호
	private String owner;		// 소유자
	private String pwd;			// 패스워드
	private String launch_date; // 계좌개설일자
	
	private List<TransactionVO> transactionList = new ArrayList<>(); // 거래 내역
	
	public List<TransactionVO> transactionList() {
		// 전체 거래 리스트
		return transactionList;
	}
	
	public void addTransaction(TransactionVO vo) {
		// 거래 내역 등록
		transactionList.add(vo);
	}
	
	public TransactionVO lastTransaction() {
		// 마지막 거래 내역
		if(transactionList.size() > 0) {
			return transactionList.get(transactionList.size() - 1);
		}
		
		return null;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}

	public List<TransactionVO> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<TransactionVO> transactionList) {
		this.transactionList = transactionList;
	}
}
