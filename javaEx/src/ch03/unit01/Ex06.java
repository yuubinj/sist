package ch03.unit01;

public class Ex06 {
	
	public static void main(String[] args) {
		char ch;
		
		ch = 'A';
		// ch = ch + 5; // 컴파일 오류. char형 + int형(char형) => int형 + int형
		ch = (char) (ch + 5);
		System.out.println(ch);
		
		ch = 'A' + 10; // 리터널 연산자 리터널은 형변환이 일어나지 않는다.
		System.out.println(ch);
		
		ch = '0' + '1'; // 48 + 49 = 97 => 'a'
		System.out.println(ch); // 'a'
		
		double a = '0' + '1';
		System.out.println(a); // 97.0
				
	}

}
