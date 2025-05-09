package ch13.unit04;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
  - TimerTask
    : 추상클래스
    : 스케쥴에 따라 해야 할 일을 TimerTask를 상속 받아 run 메소드를 재정의하여 구현
  - Timer
    : 스케쥴
    
  - Timer 단점
  	: 지연될 수 있다.
 */

public class Ex01_Timer {

	public static void main(String[] args) {
		new MyTask1();

	}

}

class MyTask1 {
	public MyTask1() {
		// TimerTask : 타이머에 의해 1회 또는 반복적으로 실행하도록 테스크되는 스케쥴
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				print();
			}
		};
		
		Timer timer = new Timer();
		// timer.schedule(task, 1000); // task 를 1초 후 한번 실행
		// timer.schedule(task, 2000, 1000); // task 를 2초 후 실행하고 1초마다 실행
		timer.schedule(task, new Date(), 1000); // 바로 실행하고 1초마다 반복
		
		// timer.cancel(); // 타이머 멈추기
	}
	
	private void print() {
		Calendar cal = Calendar.getInstance();
		String s = String.format("%tF %tT", cal, cal);
		System.out.println(s);
	}
}
