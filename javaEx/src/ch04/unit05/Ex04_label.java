package ch04.unit05;

public class Ex04_label {

	public static void main(String[] args) {
		// 1 : 1  1 : 2  2 : 1  2 : 3  3 : 2  3 : 3
		
		/*
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j == 4) {
					continue;
				}
				System.out.println(i + " : " + j);
			}
		}
		*/
		
		jump:
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j == 4) {
					continue jump;
				}
				System.out.println(i + " : " + j);
			}
		}	

	}

}
