package algo13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] missile = reader.readLine().split(" ");
		reader.close();
		int[] high = new int[missile.length];
		for (int i = 0; i < high.length; i++) {
			high[i] = Integer.parseInt(missile[i]);
		}
		System.out.println(getMaxIntercept(high));
		System.out.println(getNumberOfIntercepter(high));
	}
	
	private static int getMaxIntercept(int[] high) {
		int[] dp = new int[high.length];
		int max = 0;
		for (int i = 0; i < high.length; i++) {
			for (int j = i + 1; j < high.length; j++) {
				if (high[j] <= high[i]) {
					dp[j] = Integer.max(dp[j], dp[i] + 1);
					max = Integer.max(max, dp[j]);
				}
			}
		}
		return max + 1;
	}
	
	private static int getNumberOfIntercepter(int[] high) {
		int numberOfIntercepter = 0;
		boolean[] isIntercept = new boolean[high.length];
		for (int i = 0; i < high.length; i++) {
			int midHighDifference = getMinHighDifference(high, i, isIntercept);
			if (midHighDifference == -1) {
				numberOfIntercepter++;
			} else {
				isIntercept[midHighDifference] = true;
			}
		}
		return numberOfIntercepter;
	}
	
	private static int getMinHighDifference(int[] high, int pos, boolean[] isIntercept) {
		int minHighDifferenceIndex = -1;
		for (int i = 0; i < pos; i++) {
			if (isIntercept[i] == false && high[i] >= high[pos]) {
				if (minHighDifferenceIndex == -1 || high[i] < high[minHighDifferenceIndex]) {
					minHighDifferenceIndex = i;
				}
			}
		}
		return minHighDifferenceIndex;
	}
}
