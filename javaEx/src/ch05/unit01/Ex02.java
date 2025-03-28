package ch05.unit01;

/*
  - 향상된 for 문
  	for(타입 변수 : iterableObj) {
  	}
  	
  	iterableObj : 배열이나 Iterable 인터페이스 구현 객체
 */

public class Ex02 {

	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 2; num[1] = 4; num[2] = 6; num[3] = 8; num[4] = 10;
		
		int s = 0;
		for(int n : num) { // 향상된 for 문
			System.out.print(n + " ");
			s += n;
		}
		System.out.println("\n합 : " + s);

	}

}
