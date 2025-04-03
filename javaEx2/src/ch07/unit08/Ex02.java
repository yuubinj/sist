package ch07.unit08;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String[] ss = new String[] {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종"};
		int idx;
		
		Arrays.sort(ss);
		System.out.println("오름차순 정렬 후 : " + Arrays.toString(ss));
		
		// 이분검색(반드시 정렬 되어 있어야 함)
		idx = Arrays.binarySearch(ss, "인천");
		System.out.println("인천 위치 : " + idx);

		idx = Arrays.binarySearch(ss, "경기");
		System.out.println("경기 위치 : " + idx); // 없으면 -1
		
	}

}
