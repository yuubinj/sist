package ch04.unit04;

public class Ex03 {

	public static void main(String[] args) {

		/*
		  i: 1, j: 1
		  i: 1, j: 2
		  i: 2, j: 1
		*/
		/*
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break;
				}
				System.out.println("i: "+ i + ", j: " + j);
			}
		}
		*/

		
		/*
		  i: 1, j: 1
		  i: 1, j: 2
		*/
		gogo:	// 라벨
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					break gogo;
				}
				System.out.println("i: "+ i + ", j: " + j);
			}
		}


	}

}
