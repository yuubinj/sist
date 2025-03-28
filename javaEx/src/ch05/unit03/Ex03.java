package ch05.unit03;

/*
 	a | 0x100 |	-> a[0] | 0x200 | -> 0x200 | 10 | 20 | 30 |   	
 				   a[1] | 0x300 | -> 0x300 | 40 | 50 | 60 |
 				   
 	b | 0x700 |	-> b[0] | 0x200 |  	
 				   b[1] | 0x300 |

 	자바는 배열의 배열이므로
 	1차원 배열이 1차원 배열의 주소를 가리킨다.
 	따라서 a배열을 arraycopy 로 복사하면 실제값이 복사되는 것이 아니라
 	주소가 복사된다.
 				   
 */

public class Ex03 {

	public static void main(String[] args) {
		int [][]a = new int[][] {{10,20,30}, {40,50,60}};
		int [][]b = new int[2][3];
		// int [][]b = new int[a.length][a[0].length];
		
		System.arraycopy(a, 0, b, 0, b.length);
				
		System.out.println("a 배열...");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("b 배열...");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(a[1][1] + " : " + b[1][1]); // 50 : 50
		b[1][1] = 100;
		System.out.println(a[1][1] + " : " + b[1][1]); // 100 : 100
		
	}
}
