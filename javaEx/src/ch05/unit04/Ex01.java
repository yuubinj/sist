package ch05.unit04;

/*
   - 명령행 인수
     프로그램을 실행할 때 값을 프로그램에 넘겨줄 때 사용
     
   - Ex01 클래스를 실행
     1) 명령행 인수를 넘기지 않은 경우
        cmd > java Ex01
     
     2) 명령행 인수를 넘긴 경우
     	// 문자열만 넘어갈 수 있음
        cmd > java Ex01 oracle css html
        
        => main(String[] args) 의 args 에 값이 넘어간다.
        args[0] <- "oracle"
        args[1] <- "css"
        args[2] <- "html"
        
 */
public class Ex01 {

	public static void main(String[] args) {
		// 명령행 인수
		System.out.println("명령행 인수...");
		for(String s: args) {
			System.out.print(s + " ");
		}
		System.out.println();

	}

}
