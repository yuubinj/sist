package ch05.unit01;

public class Ex01_array {

	public static void main(String[] args) {
		// 배열 선언 및 값 할당
		int []a; // 배열 선언
		a = new int[5]; // 메모리 할당(정수 5개를 저장할 수 있는 정수형 배열)
		
		// int [] a = new int[5]; // 배열 선언 및 메모리 할당
		
		// 배열은 메모리를 할당하면 숫자 배열은 0으로 초기화 된다.
		// System.out.println(a[0]); // 0

		// 배열의 첨자는 0부터 길이-1 까지 사용
		a[0] = 1; a[1] = 3; a[2] = 5; a[3] = 7; a[4] = 9;
		// a[5] = 11; // 런타임오류. ArrayIndexOutOfBoundsException
		
		/*
		int s = 0;
		for(int i=0; i<5; i++) {
			s += a[i];
		}
		System.out.println("결과 : " + s);
		*/
		
		// length 속성 : 배열 요소의 개수
		System.out.println("배열 요소의 개수 : " + a.length);
		
		int s = 0;
		for(int i=0; i<a.length; i++) {
			s += a[i];
		}
		System.out.println("결과 : " + s);
		
	}

}
