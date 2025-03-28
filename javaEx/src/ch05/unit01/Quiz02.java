package ch05.unit01;

// import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		/*
		Scanner sc = new Scanner(System.in);
		int []point = new int[5];
		int max, min;
		int s = 0;
		int get;
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "번째 점수 : ");
			point[i] = sc.nextInt();
			if(point[i] < 0 || point[i] > 10) {
				i--;
			}
			s += point[i];
		}
		System.out.println();

		System.out.print("점수 리스트: ");
		for(int i=0; i<point.length; i++) {
			 System.out.print("\t" + point[i]);			
		}
		
		Arrays.sort(point);
		max = point[4];
		min = point[0];
		
		get = s - max - min;

		System.out.println();
		System.out.println("취득 점수 : " + get);
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		int max, min;
		int tot, result;
		
		tot = 0;
		for(int i=0; i<score.length; i++) {
			do {
				System.out.print((i+1) + "번째 점수 : ");
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 10);
			
			tot += score[i];
		}
		
		System.out.println();

		// 최대 / 최소 : 가장 처음값을 초기값으로
		max = min = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}
		
		result = tot - max - min;

		System.out.print("점수 리스트: ");
		for(int n : score) {
			 System.out.print(n + " ");			
		}
		
		
		System.out.println();
		System.out.println("취득 점수 : " + result);
		
		sc.close();

	}

}
