package ch05.unit01.sortEx;

public class Ex02_Bubble {

	public static void main(String[] args) {
		
		int[] num = { 34, 65, 12, 87, 1, 3, 6, 37, 24, 77 };
		int t;
		
		System.out.print("source data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(int i=1; i<num.length; i++) {
			for(int j=0; j<num.length-i; j++) {
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num[j+1]; num[j+1] = t;
				}
				/*
				for(int n:num) {
					System.out.print(n + " ");
				}
				System.out.println();
				*/
			}
		}
		
		System.out.print("sort data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}

}
