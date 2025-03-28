package ch02.unit06;

public class Ex02 {
	/**
	 * 짝수인지 판별하는 메소드
	 * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다.</p>
	 * @param num	짝수인지 판별할 수 <code>int</code>
	 * @return		짝수인지 여부를 반환한다. <code>boolean</code>
	 */
	// command에 javadoc -use -d doc Ex02.java 해서 API 만들기
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
}
