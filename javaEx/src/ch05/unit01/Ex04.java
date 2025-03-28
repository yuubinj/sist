package ch05.unit01;

public class Ex04 {

	public static void main(String[] args) {
		// 일반 변수
		int x = 10;
		int y = x; // 방을 새로 잡는 것.
		y += 20;
		System.out.println(x+ ", " + y); // 10, 30
		System.out.println();
		
		// 배열 : 배열은 참조형이다.
		int [] a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		System.out.println("초기 a 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 10 20 30
		}
		System.out.println();
		
		int [] b = a; // 방을 새로 잡는 것이 아니라, a와 b가 하나의 방을 공유
		// a와 b는 동일 주소를 참조(공유)
		b[1] = 100; b[2] = 200;
		
		System.out.println("\na 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 10 100 200
		}
		
		System.out.println("\nb 배열...");
		for(int n : b) {
			System.out.print(n + " "); // 10 100 200
		}
		System.out.println();
		

	}

}
