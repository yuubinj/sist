package ch04.unit04;

public class Ex01_break {

	public static void main(String[] args) {
		// break : while, do~while, for, switch~case 문을 빠져나감.
		
		int n, s;
		n = s = 0;
		while(true) {
			n++;
			s+=n;
			if(n>=100) {
				break;
			}
		}
		
		System.out.println("결과 : " + s);

	}

}
