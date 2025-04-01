package ch07.unit04;

public class Quiz03 {

	public static void main(String[] args) {
		// 369 게임
		
		/*
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			String num = Integer.toString(i);
			if(num.contains("3") ||num.contains("6")||num.contains("9")) {
				System.out.print("짝!" + "\t");
			} else {
				System.out.print(i + "\t");
			}
			
			count++;
			if(count%10==0) {
				System.out.println();
			}
		}
		*/
		
		int n = 100;
		
		String s;
		for(int i=1; i<=n; i++) {
			s = Integer.toString(i);
			// s = s.replaceAll("(3|6|9)", "*");
			s = s.replaceAll("[369]", "*");
			
			if(s.indexOf("*") != -1) {
				s = s.replaceAll("\\d", "");	
			}
			
			System.out.printf("%5s", s);
			
			if(i%10 == 0) {
				System.out.println();
			}
		}

	}

}
