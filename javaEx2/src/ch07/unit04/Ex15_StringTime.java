package ch07.unit04;

// String, StringBuilder, StringBuffer 시간 비교
public class Ex15_StringTime {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.stringTime();
		
		t.stringBufferTime();
		
		t.stringBuilderTime();

	}

}

class Test{
	public void stringTime() {
		System.out.println("\nString ...");
		
		// 시스템 시간을 ms(millisecond)로 환산하여 반환
		long start = System.currentTimeMillis();
		String s = "a";
		for(int i=1; i<100000; i++) {
			s += "a"; // 절대 해서는 안되는 코딩
		}
		long end = System.currentTimeMillis();
		
		System.out.print("문자열 길이 : " + s.length());
		System.out.println("\t걸린시간 : " + (end-start) + "ms");
		System.out.println();
		
	}
	
	public void stringBuilderTime() {
		System.out.println("StringBuilder ...");
		
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<100000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.print("문자열 길이 : " + sb.length());
		System.out.println("\t걸린시간 : " + (end-start) + "ms");
		System.out.println();
	}
	
	public void stringBufferTime() {
		System.out.println("StringBuffer ...");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for(int i=1; i<100000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.print("문자열 길이 : " + sb.length());
		System.out.println("\t걸린시간 : " + (end-start) + "ms");
		System.out.println();
	}
}