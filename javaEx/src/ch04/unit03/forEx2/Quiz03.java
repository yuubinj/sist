package ch04.unit03.forEx2;

public class Quiz03 {

	public static void main(String[] args) {
		
		// a + b + c =25
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				for(int c=1; c<10; c++) {
					if(a + b + c ==25) {
						System.out.printf("%d + %d + %d = %d\n",a,b,c, a+b+c);
					}
				}
			}
		}

	}

}
