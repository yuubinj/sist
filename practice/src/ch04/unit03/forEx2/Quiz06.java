package ch04.unit03.forEx2;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		int s;
		for(int i=4; i<=1000; i++) {
			s = 0;
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					s += j;
				}
			}
			if(s==i) {
				System.out.print(i + " ");
			}

		}
		
	}

}
