package ch05.unit01;

import java.util.Arrays;

public class Ex11_sort {

	public static void main(String[] args) {
		int []num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("발생된 난수 : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 정렬
		Arrays.sort(num); // 오름차순으로 정렬
		
		System.out.println("정렬 후 : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
