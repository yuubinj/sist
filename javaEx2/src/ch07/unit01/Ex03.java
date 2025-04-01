package ch07.unit01;

import java.util.Scanner;

//정적인 멤버를 클래스명을 명시하지 않고 접근
import static java.lang.Math.*;
// import static 해주면 -> Math가 가진 모든 것을 클래스명 명시하지 않아도 쓸 수 있다.
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		double s;
		
		System.out.print("각도 ? ");
		a = sc.nextInt();
		
		s = cos(PI * a / 180.0);
		System.out.println(a + " 각도의 cos 값 : " + s);
		
		sc.close();

	}

}
