package ch03.unit01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dist, speed;
		int h, m;
		double s;
		double time;
		
		System.out.print("주행 거리(km) ? ");
		dist = sc.nextInt();
		
		System.out.print("시속(km/h) ? ");
		speed = sc.nextInt();
		
		time = (double)dist / speed; // 단위 : 시간(hour)
		h = (int)time;
		//h = dist / speed;
		m = (int)((time * 60) % 60);
		//m = (int)((dist % speed) / ((double)speed / (double)60));
		s = (time * 60 * 60) % 60;
		s = ((int) (s * 100)) / 100.0; // 소수점 3째자리 버림.
		
		System.out.printf("%d km => %d시간 %d분 %.2f초 소요", dist, h, m, s);
		
		sc.close();

	}

}
