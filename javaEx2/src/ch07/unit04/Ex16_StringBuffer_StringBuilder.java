package ch07.unit04;

/*
  - StringBuilder
  	: synchronization 이 적용되지 않아 스레드 환경에서는 안전하지 않음
  - 아래 예제는 추후 설명 예정
 */

public class Ex16_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		// 스레드 환경에서 문자열을 10000 번 추가
		new Thread(() ->{
			for(int i=0; i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();

		// 스레드 환경에서 문자열을 10000 번 추가
		new Thread(() ->{
			for(int i=0; i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		// 확인
		new Thread(() -> {
			try {
				Thread.sleep(5000); // 5초동안 대기
				
				// StringBuffer 보다 StringBuilder의 길이가 더 적게 출력
				// 즉, StringBuilder는 모든 문자열이 append 되지 못했다.(완전하지 못함. - 동시성의 문제 때문)
				System.out.println("StringBuffer 길이 : " + buffer.length());
				System.out.println("StringBuilder 길이 : " + builder.length());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		
	}

}
