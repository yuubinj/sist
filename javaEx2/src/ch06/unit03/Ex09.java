package ch06.unit03;

public class Ex09 {

	public static void main(String[] args) {
		int[] num = new int[] {15, 7, 8, 10, 23};
		
		disp("source data", num);
		sort(num);
		disp("sort data", num);
		
	}
	
	public static void disp(String title, int[] num) {
		System.out.print(title + " : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void sort(int[] num) {
		// bubble sort
		boolean flag;
		int t;
		
		flag = true;
		for(int i=1; flag; i++) {
			flag = false;
			
			for(int j=0; j<num.length-i; j++) {
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num[j+1]; num[j+1] = t;
					flag = true;
				}
			}
		}

	}

}
