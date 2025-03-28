package ch06.unit03;

public class Ex02 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		int s;
		String result;
		char c;
		
		s = t.sum(100);
		System.out.println("결과 : " + s);
		
		s = 10;
		result = t.isEven(s) ? "짝수" : "홀수";
		System.out.println(s + " : " + result);

		c = 'c';
		System.out.println(c + " -> " + t.upper(c));
		
		System.out.println(t.isLeapYear(2025)); // false
		System.out.println(t.isLeapYear(2024) ? "윤년" : "평년"); // 윤년
		
		System.out.println(t.max(5, 7));
		System.out.println(t.min(5, 7));
		
		t.gugudan(3);
		
		System.out.println(t.grade(91));
		
		System.out.println(t.hakjeom(85));
	}

}


class Test2{
	// 1~n 까지 합 구하기
	public int sum(int n) {
		int s = 0;
		
		for(int i=1; i<=n; i++) {
			s += i;
		}
		
		return s;
	}
	
	// n이 짝수이면 true, 홀수이면 false를 반환하는 메소드
	public boolean isEven(int n) {
		return n%2 == 0;
	}
	
	// 문자가 소문자이면 true, 그렇지 않으면 false
	public boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}
	
	public boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}
	
	// 소문자이면 대문자로 변환
	public char upper(char c) {
		// return c >= 'a' && c <= 'z' ? (char)(c-32) : c;
		// return c >= 'a' && c <= 'z' ? c-=32 : c;
		return isLower(c) ? (char)(c-32) : c;
	}
	
	// 윤년 판단
	public boolean isLeapYear(int y) {
		return y%4==0 && y%100!=0 || y%400==0;
	}
	
	// 두 정수 중 큰 수 구하기
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public int min(int a, int b) {
		return a < b ? a : b;
	}
	
	// n단의 구구단 출력. 단 n이 1~9 사이가 아니면 출력하지 않음.
	// void : 메소드 실행 후 값을 되돌려 받을 필요가 없는 경우 사용
	public void gugudan(int n) {
		if(n < 1 || n > 9) {
			return;
		}
		
		System.out.println("** " + n + "단 **");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %2d\n", n, i, n*i);
		}
		
		return; // void 인 경우 return;은 생략 가능
	}
	
	// 점수에 따른 평점(95~100:4.5, 90~94:4.0 ... 59~0:0)
	public double grade(int n) {
		double result;
		
		if(n >= 95) result = 4.5;
		else if(n >= 90) result = 4.0;
		else if(n >= 85) result = 3.5;
		else if(n >= 80) result = 3.0;
		else if(n >= 75) result = 2.5;
		else if(n >= 70) result = 2.0;
		else if(n >= 65) result = 1.5;
		else if(n >= 60) result = 1.0;
		else result = 0.0;
		
		return result;
	}
	
	// 학점
	public String hakjeom(int n) {
		String s = null;
		
		/*
		s = switch(n/10) {
		case 10, 9 -> "A";
		case 8 -> "B";
		default -> "F";
		};
		*/
		
		switch(n/10) {
		case 10:
		case 9 : s = "A"; break;
		case 8 : s = "B"; break;
		case 7 : s = "C"; break;
		case 6 : s = "D"; break;
		default: s = "F"; break;
		}
		
		return s;
	}
	
}