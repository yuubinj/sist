package ch02.unit03;


/*
    - System.out.println([인수])
      : 인수의 내용을 출력하고 라인을 넘긴다.
      : 인수가 없는 경우 라인만 넘긴다. 
*/

public class Ex02_Println {

	public static void main(String[] args) {
		System.out.println("HTML 5");
		System.out.println("CSS 3");
		System.out.println(); // 라인 넘김. System.out.print("\n");과 동일한 결과
		
		System.out.println("JAVA\n");
		System.out.println("ORACLE");
		System.out.println();
		
		System.out.println("국어\t영어\t수학");
		System.out.println(80 + "\t" + 90 + "\t"+ 100);
		
		
	}

}
