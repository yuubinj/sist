package ch04.unit03;

public class Ex15__ {

	public static void main(String[] args) {
		// 1~100 까지 수 중 난수를 100개 발생하여 한 줄에 10개씩 출력
		int n, cnt;
		
		cnt = 0;
		while(cnt < 100) {
			cnt ++;
			n = (int)(Math.random() * 100) + 1;
			
			System.out.print(n + (cnt%10==0 ? "\n" : "\t"));
		}

	}

}
