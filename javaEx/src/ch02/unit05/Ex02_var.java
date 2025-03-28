package ch02.unit05;

public class Ex02_var {

	public static void main(String[] args) {
		
		// 정수 배열
		int[] arr = {2, 4, 6, 8, 10};
		
		/*
		for(int n : arr) {
			System.out.println(n + " ");
		}
		*/
		
		int s = 0;
		// arr이 정수형이기 때문에 var도 정수라고 추론할 수 있다.
		for(var n : arr) {
			s += n;
		}
		
		System.out.println("합: " + s);

	}

}
