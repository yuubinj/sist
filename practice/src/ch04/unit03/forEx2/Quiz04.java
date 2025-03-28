package ch04.unit03.forEx2;

public class Quiz04 {

	public static void main(String[] args) {
		int s = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i + " - ");
				s += i;
			} else {
				System.out.print(i + (i==10 ? " = " : " + "));
				s -= i;
			}
		}
		System.out.print(s);
		System.out.println();

	}

}
