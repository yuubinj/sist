package ch04.unit03.forEx;

public class Ex09 {

	public static void main(String[] args) {
		int n, s;
		n = s = 0;
		
		// 무한 루프 -> while 쓰는 게 낫다.
		for( ; ; ) {
			n ++;
			s += n;
			if(n >= 10) {
				break;
			}
		}
		System.out.println("결과 : " + s);

	}

}
