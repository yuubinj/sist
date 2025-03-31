package ch04.unit03.forEx;

/*
     *
    ***
   *****
  *******
 *********
*/

public class Ex21_2 {

	public static void main(String[] args) {

		for(int i=0; i<9 ; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
