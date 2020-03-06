package adv166;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] g = new int[n];
		for (int i = 0; i < n; i++) {
			g[i] = in.nextInt();
		}
		in.close();

		int[][] dp = new int[n][2];
		dp[0][0] = 1;
		dp[0][1] = 1;
		for (int i = 1; i < n; i++) {
			dp[i][1] = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (g[i] >= g[j]) {
					dp[i][1] = Integer.max(dp[i][1], dp[j][1] + 1);
				}
			}
			
			dp[i][0] = Integer.max(dp[i - 1][0], dp[i][1]);
		}
		System.out.println(dp[n - 1][0]);
	}

}
