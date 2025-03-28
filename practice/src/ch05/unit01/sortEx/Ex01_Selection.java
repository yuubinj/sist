package ch05.unit01.sortEx;

public class Ex01_Selection {

	public static void main(String[] args) {
		
		int[] num = { 34, 65, 12, 87, 1, 3, 6, 37, 24, 77 };
		int t;

		System.out.print("source data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					t= num[i]; num[i] = num[j]; num[j]=t; 
				}
			}
		}

		System.out.print("sort data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
