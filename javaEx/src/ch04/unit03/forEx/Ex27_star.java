package ch04.unit03.forEx;

public class Ex27_star {

	public static void main(String[] args) {
		
		// 모래시계
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
