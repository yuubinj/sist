package ch14.unit02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_BufferedReader {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 문자 스트림에서 문자를 읽고, 문자 및 배열 및 한줄씩 문자를 효율적으로 읽을 수 있도록 buffer
			// 한줄씩 입력도 가능
		try {
			String name;
			int age;
			
			System.out.print("이름 ? ");
			name = br.readLine();
			
			System.out.print("나이 ? ");
			age = Integer.parseInt(br.readLine());
			
			System.out.println(name + " : " + age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
