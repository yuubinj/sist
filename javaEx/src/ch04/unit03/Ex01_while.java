package ch04.unit03;

public class Ex01_while {

	public static void main(String[] args) {
		/*
		int n;
		n = 0; // 반드시 초기화가 필요
		while( n < 10 ) {
			n++;
			System.out.print(n + " "); // 1 2 3 4 ... 10
		}
		System.out.println();
		System.out.println("while 밖 n : " + n); // 10
		*/
		
		/*
		int n = 0; // 선언과 동시에 초기화;
		while(n++ < 10) {
			System.out.print(n + " "); // 1 2 3 4 ... 9 10
		}
		System.out.println();
		System.out.println("while 밖 n : " + n); // 11
		*/
		
		int n = 0;
		while(++n <= 10) {
			System.out.print(n + " "); // 1 2 3 4 ... 9 10
		}
		System.out.println();
		System.out.println("while 밖 n : " + n); // 11
			
	}

}
