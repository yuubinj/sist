package ch07.unit04;

public class Ex14_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("자바");
		sb.append("오라클");
		sb.append("스프링");
		
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
