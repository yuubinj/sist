package ch05.unit01.sortEx;

public class Ex04_Insertion {

	public static void main(String[] args) {
		
		/* -- 내가 푼 것
		int[] num = new int[] { 25, 15, 7, 4, 12, 9, 17, 16, 20, 13 };
		int t;

		System.out.print("source data : ");
		for(int n: num) {
			System.out.print(n + " ");
		}
		System.out.println();

		// 1회전 1:0
		// 2회전 2:1 1:0
		// 3회전 3:2 2:1 1:0
		
		for(int i=1; i<num.length; i++) {

			for(int j=i; j>0; j--) {
				if(num[j-1] > num[j]) {
					t = num[j-1]; num[j-1] = num[j]; num[j] = t;
				}
				
				System.out.print(i + "회전 : ");
				for(int n:num) {
					System.out.print(n + " ");
				}
				System.out.println();
				
			}
			
		}
		
		System.out.print("sort data : ");
		for(int n : num) { 
			System.out.print(n + " ");
		}
		System.out.println();
		*/
		
		int[] num = new int[] { 25, 15, 7, 4, 12, 9, 17, 16, 20, 13 };
		int i,j,key;

		System.out.print("source data : ");
		for(int n: num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(i=1; i< num.length; i++) {
			key = num[i];
			for(j=i-1; j>=0; j--) {
				if(key < num[j]) {
					num[j+1] = num[j];
				} else {
					break;
				}
			}
			num[j+1] = key;
			/*
			System.out.print(i + "회전 : ");
			for(int n:num) {
				System.out.print(n + " ");
			}
			System.out.println();
			*/
		}
		
		System.out.print("sort data : ");
		for(int n: num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
