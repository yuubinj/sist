package ch04.unit03.forEx2;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		int s;
		String operator;

		System.out.print("1 ");
		s = 1;
		for(int i=2; i<=10; i++) {
			if(i%2==1) {
				s += i;
				operator = "+";
			} else {
				s -= i;
				operator = "-";
			}
			System.out.print(operator + " " + i + " ");
		}
		System.out.print(" = " + s);
		*/
		
		// 1-2+3-4..-10= -5
		int s= 0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				s += i;
				System.out.print(i + " - ");
			} else {
				s -= i;
				System.out.print(i + (i==10 ? " = " : " + "));
			}
		}
		System.out.println(s);
	}

}
