package ch07.unit04;

public class Quiz05_GeneratePwd {

	public static void main(String[] args) {
		Account obj = new Account();
		
		System.out.println(obj.generatePwd());
		System.out.println(obj.generatePwd());
		System.out.println(obj.generatePwd());
	}

}

class Account{
	public String generatePwd() {
		StringBuilder sb = new StringBuilder();
		
		// 영어대소문자, 숫자, 특수문자를 랜덤으로 조합하여 10자리 임시패스워드 만들기
		// (int)(Math.random()*10) => 0~9 사이의 난수
		
		String s = "!@#$%^&*-+=ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		/*
		for(int i=0; i<10; i++) {
			char ch = s.charAt((int)(Math.random()*s.length()));
			sb.append(ch);
		}
		*/
		int n;
		for(int i=0; i<10; i++) {
			n = (int)(Math.random()*s.length());
			sb.append(s.charAt(n));
			// sb.append(s.substring(n, n+1));
		}
		
		return sb.toString();
	}
}