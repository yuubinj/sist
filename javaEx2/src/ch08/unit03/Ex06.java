package ch08.unit03;

public class Ex06 {

	public static void main(String[] args) {
		Object o = new Test6();
		
		/*
		if(o instanceof Test6) {
			((Test6)o).disp();
		}
		*/
		
		// instanceof 연산자의 패턴매칭
		// JDK 14 preview, 16 부터 정식 스팩
		if(o instanceof Test6 t) {
			t.disp();
		}
	}

}

class Test6{
	int a = 10;
	
	public void disp() {
		System.out.println(a);
	}
}