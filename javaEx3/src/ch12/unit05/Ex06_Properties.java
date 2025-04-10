package ch12.unit05;

import java.util.Iterator;
import java.util.Properties;

/*
  - Properties
  	: Hashtable 를 상속 받음
  	: 키와 값이 문자열(String)만 가능
  	: 파일 저장 및 불러오기가 간단해서 환경 설정 등에서 많이 사용
 */

public class Ex06_Properties {
	public static void main(String[] args) {
		Properties p = new Properties();
		
		// Properties 에 값 저장
		p.setProperty("자바", "80");
			// put()을 사용할 수 있지만 권장하지 않음
		p.setProperty("스프링", "85");
		p.setProperty("서블릿", "80");
		p.setProperty("오라클", "95");
		p.setProperty("HTML", "100");
		
		// properties 를 모니터(화면상)으로 보냄
		p.list(System.out);
		System.out.println();
		
		// Properties 에 저장된 값 가져오기
		String k, s;
		
		k = "자바";
		s = p.getProperty(k); // key 를 넘겨주면 된다.
		System.out.println(k + " -> " + s);
		
		System.out.println("\n전체...");
		Iterator<Object> it = p.keySet().iterator();
		while (it.hasNext()) {
			String key = (String)it.next();
			String value = p.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
}
