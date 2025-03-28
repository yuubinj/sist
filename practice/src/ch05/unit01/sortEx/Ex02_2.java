package ch05.unit01.sortEx;

public class Ex02_2 {

	public static void main(String[] args) {
		
		int[] num = { 34, 65, 12, 87, 1, 3, 6, 37, 24, 77 };
		int t;
		boolean flag;
		
		System.out.print("source data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();

		flag = true;
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<num.length-i; j++) {
				if(num[j] > num[j+1]) {
					t= num[j]; num[j] = num[j+1]; num[j+1]=t;
					flag = true;
				}
			}
			System.out.print(i + "횟수 : ");
			for(int n:num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		/*
		for(int i=1; i<num.length; i++) {
			for(int j=0; j<num.length-i;j++) {
				if(num[j] > num[j+1]) {
					t= num[j]; num[j] = num[j+1]; num[j+1]=t; 
				}
			}
			System.out.print(i + "횟수 : ");
			for(int n:num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		*/
		
		System.out.print("sort data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
