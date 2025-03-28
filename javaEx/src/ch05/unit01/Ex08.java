package ch05.unit01;

public class Ex08 {

	public static void main(String[] args) {
		/*
		  - 1차원 배열 초기화
		    : 초기화 할 경우 초기값의 개수가 배열의 크기
		    : 초기화 할 경우 new int[]를 new int[5] 처럼 요소의 크기 지정 불가
		 */

		// 배열 선언과 동시에 초기화 - 1
		int []num = new int[] {10, 20, 30};
		// int []num = new int[5] {10, 20, 30}; // 컴파일 오류
		
		
		// 배열 선언과 동시에 초기화 - 2
		// 배열 선언과 동시에 초기화하는 경우에는 new int[] 생략 가능
		int []num2 = {100, 200, 300};
		
		// 배열 초기화 - 3, 선언과 초기화를 따로 작성하는 경우
		int []num3; // 선언
		num3 = new int[] {1, 3, 5};
		// 따로 선언하는 경우에는 new int[] 생략 불가
		
		for(int a : num) {
			System.out.print(a + " ");
		}
		System.out.println();

		for(int a : num2) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		for(int a : num3) {
			System.out.print(a + " ");
		}
		System.out.println();


	}

}
