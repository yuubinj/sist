package ch07.unit08;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		// 배열 비교
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = {1,2,3,4,5};
		
		// 주소 비교
		System.out.println(a == b); // false
		System.out.println(a == c); // false
		System.out.println(a.equals(b));  // false
		System.out.println(a.equals(c)); // false
		System.out.println();
		
		// 요소의 값 비교
		System.out.println(Arrays.equals(a, b)); // true
		System.out.println(Arrays.equals(a, c)); // false
		System.out.println();
		
		int[][] aa = {{1,2,3}, {4,5,6}};
		int[][] bb = {{1,2,3}, {4,5,6}};

		System.out.println(Arrays.equals(aa, bb)); // false
			// 얕은 비교. 2차원 배열은 1차원에서 가지고 있는 주소 비교
		System.out.println(Arrays.deepEquals(aa, bb)); // true
			// 깊은 비교. 2차원 배열은 1차원에서 가지고 있는 주소의 값 비교
		
	}

}
