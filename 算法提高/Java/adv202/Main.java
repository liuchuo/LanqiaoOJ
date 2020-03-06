package adv202;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] a = ("," + in.nextLine()).toCharArray();
		char[] b = ("." + in.nextLine()).toCharArray();
		in.close();

		int[][] dp = new int[a.length][b.length];
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < b.length; j++) {
				if (a[i] == b[j]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Integer.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}
		
		System.out.println(dp[a.length - 1][b.length - 1]);
	}

}