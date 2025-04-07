package ch08.unit04;

public class Ex02_singleton {

	public static void main(String[] args) {
		Test2 t = Test2.getInstance();
		Test2 t2 = Test2.getInstance();
		
		if(t == t2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
	}
}

/*
  - Holder 안의 INSTANCE 는 static 이므로 클래스 로딩 시 한번 호출
  - final 이므로 값을 변경할 수 없도록 구현
 */


class Test2{
	private Test2() {
	}
	
	// 중첩클래스
	private static class Holder{
		public static final Test2 INSTANCE = new Test2();
	}
	
	public static Test2 getInstance() {
		return Holder.INSTANCE;
	}
}
