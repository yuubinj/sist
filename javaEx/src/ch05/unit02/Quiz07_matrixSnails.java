package ch05.unit02;

/*
	2차원 달팽이(2개의 for, if~else if문)
*/
public class Quiz07_matrixSnails {
	public static void main(String[] args) {
		int num = 5;
		int arr[][] = new int[num][num];
		int n = 0, r = 0, c = -1;

		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 0; j < num - (i / 2); j++) {
				n++;
				if (i % 4 == 1) // 좌->우
					arr[r][++c] = n;
				else if (i % 4 == 2) // 위->아래
					arr[++r][c] = n;
				else if (i % 4 == 3) // 우->좌
					arr[r][--c] = n;
				else // 아래->위
					arr[--r][c] = n;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	} // main_end
}