package prev28;

import java.util.Scanner;

public class Main {

	public static int[][] maze = null;
	public static int cnt = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		maze = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maze[i][j] = in.nextInt();
			}
		}
		in.close();

		dfs(0, 0, 0, 0, k, n, m);
		System.out.println(cnt);
	}

	public static void dfs(int i, int j, int max, int step, int k, int n, int m) {

		if (i == n - 1 && j == m - 1) {
			if (maze[i][j] > max && step +1 == k) {
				cnt = (cnt + 1) % 1000000007;
				return;
			}
			
			if (step == k) {
				cnt = (cnt + 1) % 1000000007;
				return;
			}
			return;
		}

		if (step == k) {
			cnt = (cnt + 1) % 1000000007;
			return;
		}

		if (j + 1 <= m - 1) {
			// 向右
			dfs(i, j + 1, max, step, k, n, m); // 不拿
			if (maze[i][j] > max) {
				int temp = max;
				max = maze[i][j]; // 拿起这个宝石
				dfs(i, j + 1, max, step + 1, k, n, m); // 拿起
				max = temp;
			}
		}
		
		if (i + 1 <= n - 1) {
			// 向下
			dfs(i + 1, j, max, step, k, n, m); // 不拿
			if (maze[i][j] > max) {
				int temp = max;
				max = maze[i][j];
				dfs(i + 1, j, max, step + 1, k, n, m);
				max = temp;
			}
		}
	}

}
