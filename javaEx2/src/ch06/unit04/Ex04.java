package ch06.unit04;

public class Ex04 {

	public static void main(String[] args) {
		Test4 obj = new Test4(); // a:0, b:0, c:5
		
		obj.write(); // 0:0:5
		
		obj.set(30);
		// a:10, b:0, c:5
		
		obj.disp(); // 10,0,500
		obj.write(); // 10:0:5
	}

}

class Test4{
	// 필드(인스턴스변수)
	private int a;
	private int b;
	private int c = 5;
	
	public void set(int b) { // b:매개변수(지역변수)
		a = 10; // 필드
		b += 100; // 매개변수
	}
	
	public void disp() {
		int c = 500; // 지역변수
		System.out.println(a + "," + b + "," + c);
				// 필드,필드,지역변수
	}
	
	public void write() {
		System.out.println(a + ":" + b + ":" + c);
				// 필드:필드:필드
	}
}