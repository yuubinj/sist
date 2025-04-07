package ch08.unit06;

public class Ex07 {

	public static void main(String[] args) {
		// 익명의 구현 클래스
		// 컴파일하면 Ex07$1.class 로 클래스 파일이 만들어진다.
		Demo7 obj = new Demo7() {
			@Override
			public void disp() {
				System.out.println("disp...");
			}
		};
		
		obj.disp();
	}
}

interface Demo7 {
	public void disp();
}