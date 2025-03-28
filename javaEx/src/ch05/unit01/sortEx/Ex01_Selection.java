package ch05.unit01.sortEx;

// Selection Sort
public class Ex01_Selection {

	public static void main(String[] args) {
		int[] num = new int[] { 25, 15, 7, 4, 12, 9, 17, 16, 20, 13 };
		int t;

		System.out.print("source data : ");
		for(int n: num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// sort
		// 1회전 : (1번째:2),(1번째:3),(1번째:4),(1번째:5) ...
		// 		   (0:1), (0:2), (0:3), (0:4)
		// 2회전 : (2번째:3),(2번째:4),(2번째:5),(2번째:6) ...
		// 		   (1:2), (1:3), (1:4), (1:5)
		for(int i=0; i<num.length-1; i++) { // 회전
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					t = num[i]; num[i] = num[j]; num[j] = t; 
				}
			}
			
			/*
			System.out.print((i+1) + "회전 : ");
			for(int n:num) {
				System.out.print(n + " ");
			}
			System.out.println();
			*/
		}
		
		System.out.print("sort data : ");
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
