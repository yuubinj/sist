package ch04.unit03.forEx;

/*
	*********
	 *******
	  *****
	   ***
		*
*/


public class Ex26 {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<6-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
