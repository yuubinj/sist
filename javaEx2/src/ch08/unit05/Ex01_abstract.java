package ch08.unit05;

public class Ex01_abstract {
	public static void main(String[] args) {
		int[] data = {20, 30, 25, 17, 40, 23};
		
		System.out.print("source data : ");
		print(data);
		
		SortInt ss = new SelectionSort();
		ss.sore(data);
		System.out.print("sort data[selection sort] : ");
		print(data);
		
		SortInt bs = new BubbleSort();
		bs.sore(data);
		System.out.print("sort data[bubble sort] : ");
		print(data);

	}
	
	public static void print(int[] data) {
		for(int n: data) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

abstract class SortInt {
	private int[] value;
	
	protected abstract void sorting();
	
	public void sore(int[] value) {
		this.value = value;
		sorting();
	}
	
	// 배열의 길이
	protected int length() {
		int n = -1;
		if(value != null) {
			n = value.length;
		}
		return n;
	}
	
	// 두 정수 비교
	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}
	
	// 배열의 두 요소 값 서로 바꾸기
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

class SelectionSort extends SortInt{

	@Override
	protected void sorting() {
		for(int i = 0; i<length()-1; i++) {
			for(int j = i+1; j<length(); j++) {
				if(compare(i,j) > 0) {
					swap(i,j);
				}
			}
		}
	}
}

class BubbleSort extends SortInt{

	@Override
	protected void sorting() {
		boolean b = true;
		for(int i=1; b; i++) {
			b = false;
			for(int j=0; j<length()-i; j++) {
				if(compare(j,j+1) > 0) {
					swap(j,j+1);
					b = true;
				}
			}
		}
	}
}