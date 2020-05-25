package adv205;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Integer> prime = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		setPrime(n);

		int[] dp = new int[n + 1];
		for (int i = 0; i < prime.size(); i++) {
			for (int j = 1; j <= n; j++) {
				if (j % prime.get(i) == 0 && (j >= 2 * prime.get(i))) {
					dp[j] = Integer.max(dp[j], dp[j - 2 * prime.get(i)] + prime.get(i));
				}
			}
		}

		System.out.println(dp[n]);
	}

	private static void setPrime(int n) {
		boolean[] p = new boolean[n + 1];

		for (int i = 2; i < p.length; i++) {
			p[i] = true;
		}

		for (int i = 2; i < p.length; i++) {
			for (int j = 2; i * j < p.length; j++) {
				p[i * j] = false;
			}
		}

		for (int i = 2; i * i <= n; i++) {
			if (p[i]) {
				prime.add(i);
			}
		}
	}

}
