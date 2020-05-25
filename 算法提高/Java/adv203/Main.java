package adv203;

import java.util.Scanner;

public class Main {
	private static int[][] cheese = new int[8][8];

	private static int[] pos = new int[8];

	private static int maxValue = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				cheese[i][j] = in.nextInt();
			}
		}
		in.close();
		dfs(0, 0);

		System.out.println(maxValue);
	}

	private static boolean isOk(int row) {
		for (int i = 0; i < row; i++) {
			if (pos[row] == pos[i] || row - i == Math.abs(pos[row] - pos[i])) {
				return false;
			}
		}
		return true;
	}

	private static void dfs(int row, int maxTempValue) {
		if (row >= 8) {
			maxValue = Integer.max(maxValue, maxTempValue);
			return;
		}

		for (pos[row] = 0; pos[row] < 8; pos[row]++) {
			if (isOk(row)) {
				dfs(row + 1, maxTempValue + cheese[row][pos[row]]);
			}
		}
	}
}