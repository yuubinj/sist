package ch11.unit03;

public class Ex01 {
	public static void main(String[] args) {
		Test1<Number> t = new Test1<>();
		Integer n = 30;
		t.set(n); // 타입 매개변수의 상속 관계는 성립
		System.out.println(t.get());
		
		// Number a = t.get();
		// Integer a = t.get(); // 컴파일 오류. get()의 자료형은 Number 이기 때문에 Integer 로 받을 수 없다.
		// Integer a = (Integer)t.get(); //  -> 다운 캐스팅 해야 함.
		
		// Number a = n; // up-casting
		
		Test1<Integer> t2 = new Test1<>();
		Integer n2 = 50;
		t2.set(n2);
		System.out.println(t2.get());
		
		// Test1<Number> ob = t2; // 컴파일 오류.
			// 제네릭은 상속 관계가 아님(업캐스팅 불가)
	}
}

class Test1<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}