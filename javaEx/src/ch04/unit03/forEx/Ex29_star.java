package ch04.unit03.forEx;

public class Ex29_star {

	public static void main(String[] args) {

		int size = 9;
		int n;
		
		n = size / 2;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-n; j++) {
				System.out.print((j>=n ? "*" : " "));
			}
			
			n = i < (size/2) ? n - 1 : n + 1;
			
			System.out.println();
		}

	}

}
