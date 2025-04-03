package ch07.unit07;

import java.text.MessageFormat;

public class Ex06_MessageFormat {

	public static void main(String[] args) {
		// MessageFormat : 데이터를 정해진 양식에 맞게 출력
		// {0}, {1}, {2} : 데이터가 출력될 자리
		// 숫자는 0부터 시작
		String s = "이름: {0} \t전화: {1} \t나이: {2}";
		Object[] obj = {"김자바", "010-1111-2222", 20};
		
		String result = MessageFormat.format(s, obj);
		System.out.println(result);
		System.out.println();
		
		// '(홑따옴표)는 MessageFormat 에서 escape 문자이므로
		//  '(홑따옴표)를 출력하기 위해서는 '(홑따옴표)를 두번 기술해야 한다.
		String sql = "INSERT INTO demo VALUE(''{0}'', ''{1}'')";
		Object[][] datas = {{"너자바", 20}, {"다자바", 25}};
		
		for(int i=0; i<datas.length; i++) {
			s = MessageFormat.format(sql, datas[i]);
			System.out.println(s);
		}
		
		

	}

}
