package ch04.unit03;

public class Ex04 {

	public static void main(String[] args) {
		/*
		char ch;
		ch = 'A';
		
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			ch ++;
		}
		System.out.println();
		*/
		
		/*
		char ch = 'A';
		int cnt = 0;
		
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			ch ++;
			cnt ++;
			if(cnt % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		*/
		
		/*
		char ch = 'A';
		int cnt = 0;
		
		while(ch <= 'Z') {
			cnt ++;
			System.out.print(ch + (cnt % 7 == 0 ? "\n" : " "));
			ch ++;
		}
		System.out.println();
		*/
		
		/*
		char ch = 'A';

		while(ch <= 'Z') {
			System.out.print(ch + ((ch-64) % 7 == 0 ? "\n" : " "));
			ch ++;
		}
		System.out.println();
		*/
		
		char ch = 'A';
		int cnt = 0;
		
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			cnt ++;
			if(cnt == 7) {
				System.out.println();
				cnt = 0;
			}
			ch ++;
		}
		System.out.println();
		
	}

}
