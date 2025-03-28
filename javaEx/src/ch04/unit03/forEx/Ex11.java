package ch04.unit03.forEx;

public class Ex11 {

	public static void main(String[] args) {
		
		// 다증 for 문
		for(int i=1; i<=3; i++) {
			System.out.println("i: "+i); // 3번

			// i= 1, j= 1, 2
			// i= 2, j= 1, 2
			// i= 3, j= 1, 2
			for(int j=1; j<=2; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
			
			System.out.println("-----------"); // 3번
		}

	}

}
