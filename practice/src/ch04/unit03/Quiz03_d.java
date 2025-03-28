package ch04.unit03;

public class Quiz03_d {

	public static void main(String[] args) {
		char ch;
		int cnt;
		
		ch = 'A';
		cnt = 0;
		while(ch <= 'Z') {
			cnt ++;
			System.out.print(ch + (cnt%5==0? "\n" : " "));
			ch ++;
		}

	}

}
