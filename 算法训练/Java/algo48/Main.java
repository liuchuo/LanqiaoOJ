package algo48;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int[][] matrix = new int[n + 1][m + 1];
		for (int i = 1; i <= m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			matrix[a][i] = 1;
			matrix[b][i] = -1;
		}
		in.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

}
