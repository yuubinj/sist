package ch07.unit04;

import java.util.Scanner;

/*
  - 이름을 입력 받아 김씨 인원수를 출력
  - 입력 받은 이름이 end, End, END 이면 김씨 인원수를 출력하고 종료
  - 실행 예)
  	이름 ? 김자바
  	이름 ? 나자바
  	이름 ? 너자바
  	이름 ? 김씨
  	이름 ? end
  	김씨 : 2
 */

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int count = 0;
		
		do {
			System.out.print("이름 ? ");
			
			name = sc.next();
			
			/*
			if(name.startsWith("김")) {
				count ++;
			}
			*/
			if(name.charAt(0) == '김') {
				count ++;
			}
		} while(!name.equalsIgnoreCase("end"));
		
		System.out.print("김씨 인원 수: " + count);
		
		sc.close();
	}

}
