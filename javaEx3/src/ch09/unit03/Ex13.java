package ch09.unit03;

public class Ex13 {

	public static void main(String[] args) throws Exception { // throws : 메소드를 호출하는 곳에서 예외를 처리하도록 설정
		User13 u = new User13();
		
		// 위 처럼 main() 메소드에서 예외를 throws 할 경우
		//  예외가 발생하면 프로그램은 비정상 종료 된다.
		
		u.setValue(-5);
		int n = u.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}

}

class User13 {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) throws Exception { // 메소드를 호출한 곳에서 예외를 catch 하도록 설정
		if(value < 0) {
			// 강제로 checked exception 을 발생 시킴
			throw new Exception("0 이상만 가능합니다.");
		}
		
		this.value = value;
	}
}