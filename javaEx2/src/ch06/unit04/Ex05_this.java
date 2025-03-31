package ch06.unit04;

public class Ex05_this {

	public static void main(String[] args) {
		Test5 t1 = new Test5(); // a:0 b:0 c:5
		Test5 t2 = new Test5(); // a:0 b:0 c:5
		
		t1.set(3); // t1의 => a:10 b:103
		t1.disp(); // 10,103,50,5
		t2.disp(); // 0,0,50,5
		
		t2.set(5); // t2의 => a:10 b:105
		t2.disp(); // 10,105,50.5
	}

}

// this: 호출한 객체
// 필드와 지역변수(매개변수)의 이름이 동일하면 지역변수(매개변수)가 우선순위가 높다.
class Test5{
	private int a;
	private int b;
	private int c = 5;
	
	public void set(int b) { // b:매개변수(지역변수)
		this.a = 10; // 필드. 지역변수와 이름이 동일하지 않으면 this 생략 가능
		this.b = b + 100; // this.b:필드, b:매개변수
	}
	
	public void disp() {
		int c = 50; // 지역변수
		System.out.println("this.a : " + this.a +  // 필드
					", this.b : " + this.b + // 필드
					", c : " + c +  // 지역변수
					", this.c : " + this.c); // 필드
		
		// 필드와 지역변수명이 다르면 this 생략 가능
		// System.out.println(a+","+b+","+c+","+this.c)
		// System.out.println(this);
		
	}
}