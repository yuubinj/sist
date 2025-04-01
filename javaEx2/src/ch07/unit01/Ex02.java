package ch07.unit01;

public class Ex02 {

	public static void main(String[] args) {
		// import 하지 않고 다른 패키지의 클래스 사용
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a;
		double s;
		
		System.out.print("각도[예 : 60] ? ");
		a = sc.nextInt();
		
		s = Math.cos(Math.PI * a / 180.0);
			// Math : java.lang 패키지에 존재
			// cos() : Math 클래스의 static 메소드
			// PI : Math 클래스의 final static 변수
		System.out.println(a + " 각도의 cos 값: " + s);
		
		sc.close();
	}

}
