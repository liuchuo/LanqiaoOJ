package adv201;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			char[][] grid = new char[n][n];
			int row = 0;
			int col = 0;
			for (int j = 0; j < n; j++) {
				grid[j] = in.next().toCharArray();
				for (int k = 0; k < n; k++) {
					if (grid[j][k] == 'S') {
						row = j;
						col = k;
						break;
					}
				}
			}
			
			int q = in.nextInt();
			for (int j = 0; j < q; j++) {
				String command = in.next();
				System.out.println(preprocessing(grid, command, row, col));
			}
		}
		in.close();
	}

	private static String preprocessing(char[][] grid, String command, int row, int col) {
		char[] path = command.toCharArray();
		for (char c : path) {
			switch (c) {
			case 'L':
				col--;
				break;
			case 'R':
				col++;
				break;
			case 'U':
				row--;
				break;
			case 'D':
				row++;
				break;
			}
			
			if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
				return "I am out!";
			} else if (grid[row][col] == '#') {
				return "I am dizzy!";
			} else if (grid[row][col] == 'T') {
				return "I get there!";
			}
		}
		if (grid[row][col] == 'T') {
			return "I get there!";
		} else {
			return "I have no idea!";
		}
	}
}
