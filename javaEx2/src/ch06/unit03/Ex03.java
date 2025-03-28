package ch06.unit03;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		int [] num = {2,4,6,8,10};
		
		int s = t.total(num);
		System.out.println("결과 : " + s);
		
		int[] nn = t.lotto();
		for(int n : nn) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		int[] rr = t.random(8);
		for(int r : rr) {
			System.out.print(r + " ");
		}
		System.out.println();
	}
}

class Test3{
	// 인자로 넘어온 정수형 배열의 합 구하기
	public int total(int[]num) {
		int s = 0;
		
		for(int n : num) {
			s += n;
		}
		
		return s;
	}
	
	// 1~45까지 수 중 서로 다른 수 6개를 저장한 배열을 반환하는 메소드
	public int[] lotto() {
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45) + 1;
			
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(num);
		
		return num;
	}
	
	// 1~100 까지 수 중 난수를 매개변수로 넘겨 받은
	//  개수만큼 배열에 저장하여 배열을 반환하는 메소드
	public int[] random(int n) {
		int [] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = (int)(Math.random()*100) + 1;
		}
		
		return num;
	}
}
