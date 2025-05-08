package ch13.unit02;

import java.util.Calendar;

public class Ex05 {

	public static void main(String[] args) {
		// Thread t = new Thread(new MyThread5()); // Runnable 인터페이스로 구현할 경우
		
		MyThread5 th = new MyThread5(); // 스레드 클래스 상속으로 구현할 경우
		
		th.start();

	}

}


class MyThread5 extends Thread{
	
	@Override
	public void run() {
		try {
			while(true) {
				Calendar cal = Calendar.getInstance();
				String s = String.format("%tF %tT", cal, cal);
				System.out.println(s);
				
				sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
class MyThread5 implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Calendar cal = Calendar.getInstance();
				String s = String.format("%tF %tT", cal, cal);
				System.out.println(s);
				
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
*/