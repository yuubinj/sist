package ch02.unit03;

/*
    - System.out.print(인수)
      : 인수의 내용을 출력 장치를 통해 출력하고, 라인을 넘기지 않는다.
      : 인수는 생략할 수 없다.
*/

public class Ex01_Print {
	public static void main(String[] args) {
		//System.out.print(); // 컴파일 오류
		System.out.print("HTML 5, ");
		System.out.print("javascript, ");		
		System.out.print("CSS 3\n"); // \n: 라인을 넘긴다(코드값:10)
		
		
		System.out.print("JAVA\nJSP\n");		
		System.out.print("Spring");		
		System.out.print("\nOracle\n\n");
		
		System.out.print("국어\t"); // \t:탭간격		
		System.out.print("영어\t");		
		System.out.print("수학\n");		
		System.out.print(80 + "\t");		
		System.out.print(90 + "\t");		
		System.out.print(100 + "\n");
	}
}
