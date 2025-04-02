package ch07.unit04;

public class Ex10 {

	public static void main(String[] args) {
		/*
		// 아래처럼 코딩하면 절대 안됨.
		// String 은 불변이므로 성능이 매우 안좋다.
		String s;
		s = "자바";
		s += ", 스프링";
		s += ", 오라클";
		s += ", HTML";
		s += ", CSS";
		System.out.println(s);
		*/
		
		// 내부적으로 StringBuilder를 이용하여 문자열을 결합하므로
		//  성능이 우수
		String s;
		s = "자바"
			+ ", 스프링"
			+ ", 오라클"
			+ ", HTML"
			+ ", CSS";
		
		System.out.println(s);
				
	}

}
