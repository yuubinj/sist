package ch04.unit03;

public class Quiz07_d {

	public static void main(String[] args) {
		int x, y, s;
		
		x = 100;
		y = 0;
		s = 0;
		while(x >= y) {
			x += 2;
			y += 5;
			s ++;
		}
		System.out.println("x : " + x + ", y : " + y);
		System.out.println("걸린시간 : " + s + "초");

	}

}
