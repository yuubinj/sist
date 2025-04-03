package ch07.unit08;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		String[] ss = new String[] {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종"};

		String[] ss2 = Arrays.copyOf(ss, ss.length);
						// 원본, 길이
		System.out.println(Arrays.toString(ss2));
		System.out.println(ss == ss2); // false

		String[] ss3 = Arrays.copyOfRange(ss, 1, 4);
						// 원본, from, to-1
		System.out.println(Arrays.toString(ss3));
				// [부산, 대구, 인천]
		
		// System.arrayCopy()가 Arrays.copyOf() 보다 성능이 더 좋음.
		String[] ss4 = new String[ss.length];
		System.arraycopy(ss, 0, ss4, 0, ss.length);
		System.out.println(Arrays.toString(ss4));
	}

}
