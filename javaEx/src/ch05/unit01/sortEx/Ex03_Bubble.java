package ch05.unit01.sortEx;

public class Ex03_Bubble {

	public static void main(String[] args) {
		// 개선된 Bubble Sort
		int[] num = new int[] { 25, 15, 7, 4, 12, 9, 17, 16, 20, 13 };
		int t;
		boolean flag;

		System.out.print("source data : ");
		for(int n: num) {
			System.out.print(n + " ");
		}
		System.out.println();

		flag = true;
		for(int i=1; flag; i++) {
			flag = false;
			
			for(int j=0; j<num.length-i;j++) {
				if(num[j] > num[j+1]) {
					t=num[j]; num[j]=num[j+1]; num[j+1]=t;
					flag = true;
				}
			}
			/*
			System.out.print(i + "회전 : ");
			for(int n:num) {
				System.out.print(n + " ");
			}
			System.out.println();
			*/
		}
		
		System.out.print("sort data : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
