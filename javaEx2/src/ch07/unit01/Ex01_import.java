package ch07.unit01;

// 이클립스 : <ctrl> + <shift> + <o> => 자동 import
// java.util 패키지의 모든 클래스 import
import java.util.*;

// java.lang 패키지의 클래스를 제외한 나머지 클래스는 import 해야 사용 가능
// java.lang 패키지의 클래스 : String, System, Integer, Math 등
public class Ex01_import {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Calendar : java.util 패키지에 존재하며 날짜(시간)에 대한 정보를 제공하는 클래스
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF %tA %tT\n", cal, cal, cal);
			// %tF:년-월-일   %tA:요일   %tT:시간
		
		sc.close();

	}

}
