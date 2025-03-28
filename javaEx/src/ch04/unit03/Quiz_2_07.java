package ch04.unit03;

public class Quiz_2_07 {

	public static void main(String[] args) {
		int x, y, cnt;
		
		x = 100;
		y = 0;
		cnt = 0;
		
		/*
		while(true) {
			cnt ++;
			x += 2;
			y += 5;
			if(x < y) {
				System.out.printf("x : %d, y : %d\n", x, y);
				System.out.printf("걸린시간 : %d초\n", cnt);
				break;
			}
		}
		*/
		
		while(x >= y) {
			cnt++;
			x += 2;
			y += 5;
		}
		System.out.printf("x : %d, y : %d\n", x, y);
		System.out.printf("걸린시간 : %d초\n", cnt);

	}

}
