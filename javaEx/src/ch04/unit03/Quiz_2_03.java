package ch04.unit03;

public class Quiz_2_03 {

	public static void main(String[] args) {
		char ch;
		int cnt;
		
		ch = 'A';
		cnt = 0;
		/*
		while(ch <= 'Z') {
			cnt ++;
			System.out.print(ch + (cnt % 5 == 0 ? "\n": "\t"));
			ch ++;
		}
		*/
		
		while(ch <= 'Z') {
			System.out.print(ch + "\t");
			
			cnt ++;
			if (cnt % 5 == 0) {
				System.out.println();
			}
			
			ch ++;
		}
		
		System.out.println();

	}

}
