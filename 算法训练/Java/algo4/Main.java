package algo4;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n][2];
		final String[] valueString = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			dp[i][1] = Integer.parseInt(valueString[i]);
			v.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < n - 1; i++) {
			final String[] ab = br.readLine().split(" ");
			int a = Integer.parseInt(ab[0]) - 1, b = Integer.parseInt(ab[1]) - 1;
			v.get(a).add(b);
			v.get(b).add(a);
		}
		br.close();
		dfs(0, -1);
		System.out.println(Math.max(dp[0][0], dp[0][1]));
	}
	
	private static void dfs(int root, int pre) {
		List<Integer> temp = v.get(root);
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i) != pre) {
				dfs(temp.get(i), root);
				dp[root][1] += dp[temp.get(i)][0];
				dp[root][0] += Math.max(dp[temp.get(i)][0], dp[temp.get(i)][1]);
			}
		}
	}

	private static int[][] dp;
	private static List<List<Integer>> v = new ArrayList<>();
}