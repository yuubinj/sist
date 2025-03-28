package ch04.unit03;

public class Ex14 {

	public static void main(String[] args) {
		// 1~100 사이의 수 중 3 또는 5의 배수를 제외한 수를 한 줄에 5개씩 출력
		
		/*
		int n, cnt;
		
		n = cnt = 0;
		while(n < 100) {
			n ++;
			if(n%3!=0 && n%5!=0) {
				cnt ++;
				System.out.print(n + "\t");
				if(cnt%5==0) {
					System.out.println();
				}
			}
		}
		*/
		
		int n, cnt;
		
		n = cnt = 0;
		while(n < 100) {
			n ++;
			if(n%3!=0 && n%5!=0) {
				cnt ++;
				System.out.print(n + (cnt%5==0 ? "\n" : "\t"));
			}
		}
		

	}

}