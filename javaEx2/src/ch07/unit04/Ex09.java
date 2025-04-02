package ch07.unit04;

// import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		String [] ss = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "전주", "제주"};

		write("source data", ss);
		
		// Arrays.sort(ss);
		bubbleSort(ss);
		
		write("sort data", ss);

	}
	
	public static void write(String title, String[] ss) {
		System.out.print(title + " : ");
		
		for(String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(String[] ss) {
		boolean flag = true;
		String t;
		
		for(int i=1; flag; i++) {
			flag = false;
			
			// String compareTo() : 문자열을 사전식으로 비교하여 ASCII 코드 차이 반환
			for(int j=0; j<ss.length - i; j++) {
				if(ss[j].compareTo(ss[j+1]) > 0) {
					t = ss[j];
					ss[j] = ss[j+1];
					ss[j+1] = t;
					flag = true;
				}
			}
		}
	}
}
