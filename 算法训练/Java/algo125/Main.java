package algo125;

import java.util.Scanner;

public class Main {
	
	private static int[] pos;
	private static int x;
	private static int y;
	private static int cnt;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		pos = new int[n];
		x = in.nextInt() - 1;
		y = in.nextInt() - 1;
		in.close();
		
		dfs(0, n);
		System.out.println(cnt);
	}
	
	private static boolean isSafe(int row) {
		if (Math.abs(row - x) <= 1 && Math.abs(pos[row] - y) <= 1) {
			return false;
		}
		
		for (int i = 0; i < row; i++) {
			if (pos[row] == pos[i] || row - i == Math.abs(pos[row] - pos[i])) {
				return false;
			}
		}
		return true;
	}
	
	private static void dfs(int row, int n) {
		if (row >= n) {
			cnt++;
			return;
		}
		
		for (pos[row] = 0; pos[row] < n; pos[row]++) {
			if (isSafe(row)) {
				dfs(row + 1, n);
			}
		}
	}

}
