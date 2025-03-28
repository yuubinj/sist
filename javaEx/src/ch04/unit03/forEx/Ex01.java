package ch04.unit03.forEx;

/*
   for (초기치; 조건식; 증감식){
 	  실행문
   }
 */
public class Ex01 {

	public static void main(String[] args) {
		int n;
		
		// 반복횟수 : 10번
		for(n = 1; n <= 10; n++) {
			System.out.print(n + " "); // 1 2 ... 10
		}
		System.out.println("\n밖 : " + n); // 11
		
		System.out.println("---------------------");
		
		// 반복횟수 : 4번
		// 반복횟수에 사용된 변수 값을 변경하면 반복 횟수가 변한다.
		for(n = 1; n <= 10; n++) {
			System.out.print(n + " "); // 1 2 3 9
			if(n%3==0) {
				n += 5; // 8 14
			}
		}
		System.out.println("\n밖 : " + n); // 15
		
		System.out.println("---------------------");

		// for 문에서도 변수를 선언할 수 있다.
		// for 문에서 선언한 변수는 for 문에서만 사용 가능하다. (벗어나면 사용 불가)
		for(int a = 1; a <= 5; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		// System.out.println("밖 : " + a); // 컴파일 오류
		

	}

}
