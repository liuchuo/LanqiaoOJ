package adv229;
// 90
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] sum = new int[n + 1];
		String[] valueString = br.readLine().split(" ");
		long[][] dp = new long[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + Integer.parseInt(valueString[i - 1]);
		}
		br.close();
		
		for (int j = 2; j <= n; j++) {
			for (int i = j - 1; i >= 1; i--) {
				dp[i][j] = Long.MAX_VALUE;
				for (int k = i; k < j; k++) {
					dp[i][j] = Long.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum[j] - sum[i - 1]);
				}
			}
		}
		System.out.println(dp[1][n]);
	}
}
