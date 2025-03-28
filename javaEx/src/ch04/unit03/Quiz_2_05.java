package ch04.unit03;

public class Quiz_2_05 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		/*
		while(true) {
			n ++;
			s += n;
			if(s > 100) {
				System.out.println("최소의 n : " + n);
				System.out.println("합 : " + s);
				break;
			}
		}
		*/
		
		while(s <= 100) {
			n++;
			s+=n;
		}
		System.out.println("최소의 n : " + n);
		System.out.println("합 : " + s);

	}

}
