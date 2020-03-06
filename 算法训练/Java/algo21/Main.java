package algo21;

import java.util.Scanner;

public class Main {

	private static int[][] dpOne;
	private static int[] dpTwo;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int n = in.nextInt();
		dpOne = new int[n + 1][V + 1];
		int[] v = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			v[i] = in.nextInt();
		}
		in.close();
		MethodOne(n, v, V);
		System.out.println(V - dpOne[n][V]);
		dpTwo = new int[V + 1];
		MethodTwo(n, v, V);
		System.out.println(V - dpTwo[V]);
	}

	/*
	 * 用二维数组来存储 前n个物品放入体积为V的背包中，对于每个物品，如果不取，dp[i][j] = dp[i -
	 * 1][j]即前n-1个物品来装体积为V的这个背包 如果取，dp[i][j] = dp[i - 1][j - v[i]] + v[i]即前n
	 * -1个物品来装体积为V - v[i]的这个背包
	 */
	private static void MethodOne(int n, int[] v, int V) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= V; j++) {
				if (j >= v[i]) {
					dpOne[i][j] = Integer.max(dpOne[i - 1][j], dpOne[i - 1][j - v[i]] + v[i]);
				} else {
					dpOne[i][j] = dpOne[i - 1][j];
				}
			}
		}
	}

	/*
	 * 用一维数组来存储 对于每个物品都有取和不取两个状态，如果不取，dp[j]不变，如果取dp[j] = dp[j - v[i]] + v[i]
	 */
	private static void MethodTwo(int n, int[] v, int V) {
		for (int i = 1; i <= n; i++) {
			for (int j = V; j > 0; j--) {
				if (j >= v[i]) {
					dpTwo[j] = Integer.max(dpTwo[j], dpTwo[j - v[i]] + v[i]);
				}
			}
		}
	}
}
