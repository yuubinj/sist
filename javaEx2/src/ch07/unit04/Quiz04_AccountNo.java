package ch07.unit04;

// 은행 계좌 번호 만들기
public class Quiz04_AccountNo {

	public static void main(String[] args) {
		// 마지막 7자리 다음의 문자열 만들기
		String s;
		Bank obj = new Bank();
		
		s = obj.generateAccountNo();
		System.out.println(s); // 020-08-0000171

		s = obj.generateAccountNo();
		System.out.println(s); // 020-08-0000172
		
		s = obj.generateAccountNo();
		System.out.println(s); // 020-08-0000173
	}

}

class Bank{
	private String accountNo = "020-08-0000170";
	
	public String generateAccountNo() {
		
		/*
		String[] num = accountNo.split("-");

		int n = Integer.parseInt(num[2]);
		n++;
		
		StringBuilder sb = new StringBuilder("020-08-");
		accountNo = String.format("%07d", n);
		sb.append(accountNo);
		accountNo = sb.toString();
		
		return accountNo;
		*/
		
		String s1 = accountNo.substring(0, accountNo.lastIndexOf("-") + 1);
					// 020-08-
		String s2 = accountNo.substring(accountNo.lastIndexOf("-") + 1);
					// 0000170
		
		int n = Integer.parseInt(s2) + 1;
		accountNo = s1 + String.format("%07d", n);
		
		return accountNo;
		
	}
}