package algo31;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] dp = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int v = in.nextInt();
			int p = in.nextInt();
			for (int j = n; j >= v; j--) {
				dp[j] = Integer.max(dp[j], dp[j - v] + v * p);
			}
		}
		in.close();
		
		System.out.println(dp[n]);
	}

}
