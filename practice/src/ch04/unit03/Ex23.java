package ch04.unit03;

public class Ex23 {

	public static void main(String[] args) {
		int a, b;
		
		a = 1;
		while(a < 9) {
			a ++;
			System.out.printf("** %d단 **\n", a);
			b = 0;
			while(b < 9) {
				b++;
				System.out.printf("%d * %d = %d\n", a, b, a*b);
			}
			System.out.println("----------------");
		}

	}

}
